package com.tamal.pension.common.modules.reports;

import java.util.Arrays;
import java.util.Optional;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.primitives.Ints;
import com.tamal.pension.common.jaxb.event.IncomingEventsV06Model;
import com.tamal.pension.common.jaxb.first.FirstV06Model;
import com.tamal.pension.common.jaxb.mesakem.MesakemV02Model;
import com.tamal.pension.common.jaxb.negative.NegativeV02Model;
import com.tamal.pension.common.jaxb.pitzuim.PitzuimV04Model;
import com.tamal.pension.common.jaxb.shotef.ShotefV02Model;
import com.tamal.pension.common.jaxb.yearly.YearlyV01Model;

public enum ReportType {
	
	FIRST(20, FirstV06Model.class, 20),
	MESAKEM(2, MesakemV02Model.class, 14,15,18),
	NEGATIVE(3, NegativeV02Model.class, 13),
	SHOTEF(12, ShotefV02Model.class, 12),
	YEARLY(5, YearlyV01Model.class, 16),
	EVENT(6, IncomingEventsV06Model.class, 6),
	PITZUIM(6, PitzuimV04Model.class, 17)
	;
	
	private final int value;
	private final int[] interfaceTypeIds;
	private Class<?> modelClass;
	
	private ReportType(int value, Class<?> modelClass, int... interfaceTypeIds) {
		this.value = value;
		this.interfaceTypeIds = interfaceTypeIds;  
		Arrays.sort(interfaceTypeIds);
		
		this.modelClass = modelClass;
	}
	
	public int value(){
		return value;
	}
	public Class<?> modelClass(){
		return modelClass;
	}
	
	public static ReportType valueOf(int value){
		ReportType[] values = ReportType.values();
		for (ReportType reportType : values) {
			if(0 == Ints.compare(reportType.value(), value)){
				return reportType;
			}
		}
		
		return null;
	}
	
	public static Optional<ReportType> findByIterfaceType(int interfaceTypeId) {
		ReportType[] values = ReportType.values();
		for (ReportType reportType : values) {
			if (ArrayUtils.contains(reportType.interfaceTypeIds, interfaceTypeId)) return Optional.of(reportType);
		}
		
		return Optional.empty();
	}
}
