/*
 * Copyright 2016 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.expression;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import com.marklogic.client.type.XsUnsignedLongVal;
import com.marklogic.client.type.XsUnsignedShortSeqVal;
import com.marklogic.client.type.XsUnsignedShortVal;
import com.marklogic.client.type.XsUntypedAtomicSeqVal;
import com.marklogic.client.type.XsUnsignedIntVal;
import com.marklogic.client.type.XsUnsignedLongSeqVal;
import com.marklogic.client.type.XsUnsignedByteVal;
import com.marklogic.client.type.XsUnsignedIntSeqVal;
import com.marklogic.client.type.XsTimeVal;
import com.marklogic.client.type.XsUnsignedByteSeqVal;
import com.marklogic.client.type.XsStringVal;
import com.marklogic.client.type.XsTimeSeqVal;
import com.marklogic.client.type.XsShortVal;
import com.marklogic.client.type.XsStringSeqVal;
import com.marklogic.client.type.XsDateVal;
import com.marklogic.client.type.XsUntypedAtomicVal;
import com.marklogic.client.type.XsAnyURISeqVal;
import com.marklogic.client.type.XsAnyURIVal;
import com.marklogic.client.type.XsBase64BinarySeqVal;
import com.marklogic.client.type.XsBase64BinaryVal;
import com.marklogic.client.type.XsBooleanSeqVal;
import com.marklogic.client.type.XsBooleanVal;
import com.marklogic.client.type.XsByteVal;
import com.marklogic.client.type.XsDateSeqVal;
import com.marklogic.client.type.XsByteSeqVal;
import com.marklogic.client.type.XsDateTimeVal;
import com.marklogic.client.type.XsDateTimeSeqVal;
import com.marklogic.client.type.XsDayTimeDurationVal;
import com.marklogic.client.type.XsDayTimeDurationSeqVal;
import com.marklogic.client.type.XsDecimalVal;
import com.marklogic.client.type.XsDecimalSeqVal;
import com.marklogic.client.type.XsDoubleVal;
import com.marklogic.client.type.XsDoubleSeqVal;
import com.marklogic.client.type.XsFloatVal;
import com.marklogic.client.type.XsFloatSeqVal;
import com.marklogic.client.type.XsGDayVal;
import com.marklogic.client.type.XsGDaySeqVal;
import com.marklogic.client.type.XsGMonthDayVal;
import com.marklogic.client.type.XsGMonthDaySeqVal;
import com.marklogic.client.type.XsGMonthVal;
import com.marklogic.client.type.XsGMonthSeqVal;
import com.marklogic.client.type.XsGYearMonthVal;
import com.marklogic.client.type.XsGYearMonthSeqVal;
import com.marklogic.client.type.XsGYearVal;
import com.marklogic.client.type.XsGYearSeqVal;
import com.marklogic.client.type.XsHexBinaryVal;
import com.marklogic.client.type.XsHexBinarySeqVal;
import com.marklogic.client.type.XsIntVal;
import com.marklogic.client.type.XsIntSeqVal;
import com.marklogic.client.type.XsIntegerVal;
import com.marklogic.client.type.XsIntegerSeqVal;
import com.marklogic.client.type.XsLongVal;
import com.marklogic.client.type.XsLongSeqVal;
import com.marklogic.client.type.XsQNameVal;
import com.marklogic.client.type.XsShortSeqVal;
import com.marklogic.client.type.XsQNameSeqVal;
import com.marklogic.client.type.XsYearMonthDurationSeqVal;
import com.marklogic.client.type.XsYearMonthDurationVal;

// converts the datatype of a Java literal on the client
public interface XsValue {
    // mappings between Java and XQuery per JAXB / JSR 222 and XQJ / JSR 225
	public XsAnyURIVal               anyURI(String value);
    public XsAnyURISeqVal            anyURIs(String... values);
    public XsBase64BinaryVal         base64Binary(byte[] value);
    public XsBase64BinarySeqVal      base64Binarys(byte[]... values);
    // appending Val to avoid Java reserved word
    public XsBooleanVal              booleanVal(boolean value);
    public XsBooleanSeqVal           booleanVals(boolean... values);
    public XsByteVal                 byteVal(byte value);
    public XsByteSeqVal              byteVals(byte... values);
    public XsDateVal                 date(String value);
    public XsDateVal                 date(Calendar value);
    public XsDateVal                 date(XMLGregorianCalendar value);
    public XsDateSeqVal              dates(String... values);
    public XsDateSeqVal              dates(Calendar... values);
    public XsDateSeqVal              dates(XMLGregorianCalendar... values);
    public XsDateTimeVal             dateTime(String value);
    public XsDateTimeVal             dateTime(Date value);
    public XsDateTimeVal             dateTime(Calendar value);
    public XsDateTimeVal             dateTime(XMLGregorianCalendar value);
    public XsDateTimeSeqVal          dateTimes(String... values);
    public XsDateTimeSeqVal          dateTimes(Date ... values);
    public XsDateTimeSeqVal          dateTimes(Calendar... values);
    public XsDateTimeSeqVal          dateTimes(XMLGregorianCalendar... values);
    public XsDayTimeDurationVal      dayTimeDuration(String value);
    public XsDayTimeDurationVal      dayTimeDuration(Duration value);
    public XsDayTimeDurationSeqVal   dayTimeDurations(String... values);
    public XsDayTimeDurationSeqVal   dayTimeDurations(Duration... values);
    public XsDecimalVal              decimal(String value);
    public XsDecimalVal              decimal(long value);
    public XsDecimalVal              decimal(double value);
    public XsDecimalVal              decimal(BigDecimal value);
    public XsDecimalSeqVal           decimals(String... value);
    public XsDecimalSeqVal           decimals(long... value);
    public XsDecimalSeqVal           decimals(double... value);
    public XsDecimalSeqVal           decimals(BigDecimal... values);
    public XsDoubleVal               doubleVal(double value);
    public XsDoubleSeqVal            doubleVals(double... values);
    public XsFloatVal                floatVal(float value);
    public XsFloatSeqVal             floatVals(float... values);
    public XsGDayVal                 gDay(String value);
    public XsGDayVal                 gDay(XMLGregorianCalendar value);
    public XsGDaySeqVal              gDays(String... values);
    public XsGDaySeqVal              gDays(XMLGregorianCalendar... values);
    public XsGMonthVal               gMonth(String value);
    public XsGMonthVal               gMonth(XMLGregorianCalendar value);
    public XsGMonthSeqVal            gMonths(String... value);
    public XsGMonthSeqVal            gMonths(XMLGregorianCalendar... values);
    public XsGMonthDayVal            gMonthDay(String value);
    public XsGMonthDayVal            gMonthDay(XMLGregorianCalendar value);
    public XsGMonthDaySeqVal         gMonthDays(String... value);
    public XsGMonthDaySeqVal         gMonthDays(XMLGregorianCalendar... values);
    public XsGYearVal                gYear(String value);
    public XsGYearVal                gYear(XMLGregorianCalendar value);
    public XsGYearSeqVal             gYears(String... values);
    public XsGYearSeqVal             gYears(XMLGregorianCalendar... values);
    public XsGYearMonthVal           gYearMonth(String value);
    public XsGYearMonthVal           gYearMonth(XMLGregorianCalendar value);
    public XsGYearMonthSeqVal        gYearMonths(String... values);
    public XsGYearMonthSeqVal        gYearMonths(XMLGregorianCalendar... values);
    public XsHexBinaryVal            hexBinary(byte[] value);
    public XsHexBinarySeqVal         hexBinarys(byte[]... values);
    public XsIntVal                  intVal(int value);
    public XsIntSeqVal               intVals(int... values);
    public XsIntegerVal              integer(String value);
    public XsIntegerVal              integer(long value);
    public XsIntegerVal              integer(BigInteger value);
    public XsIntegerSeqVal           integers(String... values);
    public XsIntegerSeqVal           integers(long... values);
    public XsIntegerSeqVal           integers(BigInteger... values);
    public XsLongVal                 longVal(long value);
    public XsLongSeqVal              longVals(long... values);
    public XsShortVal                shortVal(short value);
    public XsShortSeqVal             shortVals(short... values);
    public XsStringVal               string(String value);
    public XsStringSeqVal            strings(String... values);
    public XsStringSeqVal            strings(XsStringVal... values);
    public XsTimeVal                 time(String value);
    public XsTimeVal                 time(Calendar value);
    public XsTimeVal                 time(XMLGregorianCalendar value);
    public XsTimeSeqVal              times(String... values);
    public XsTimeSeqVal              times(Calendar... values);
    public XsTimeSeqVal              times(XMLGregorianCalendar... values);
    public XsUnsignedByteVal         unsignedByte(byte values);
    public XsUnsignedByteSeqVal      unsignedBytes(byte... values);
    public XsUnsignedIntVal          unsignedInt(int values);
    public XsUnsignedIntSeqVal       unsignedInts(int... values);
    public XsUnsignedLongVal         unsignedLong(long values);
    public XsUnsignedLongSeqVal      unsignedLongs(long... values);
    public XsUnsignedShortVal        unsignedShort(short values);
    public XsUnsignedShortSeqVal     unsignedShorts(short... values);
    public XsUntypedAtomicVal        untypedAtomic(String value);
    public XsUntypedAtomicSeqVal     untypedAtomics(String... values);
    public XsYearMonthDurationVal    yearMonthDuration(String value);
    public XsYearMonthDurationVal    yearMonthDuration(Duration value);
    public XsYearMonthDurationSeqVal yearMonthDurations(String... values);
    public XsYearMonthDurationSeqVal yearMonthDurations(Duration... values);
    // XML types
    public XsQNameVal                qname(String localName);
    public XsQNameVal                qname(String namespace, String prefix, String localName);
    public XsQNameVal                qname(QName value);
    public XsQNameSeqVal             qnames(String... localNames);
    public XsQNameSeqVal             qnames(String namespace, String prefix, String... localNames);
    public XsQNameSeqVal             qnames(QName... values);
}
