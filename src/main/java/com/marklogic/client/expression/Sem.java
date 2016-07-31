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

import com.marklogic.client.type.SemInvalidExpr;
 import com.marklogic.client.type.SemIriExpr;
 import com.marklogic.client.type.XsDoubleExpr;
 import com.marklogic.client.type.XsStringExpr;
 import com.marklogic.client.type.XsAnyAtomicTypeExpr;
 import com.marklogic.client.type.SemInvalidSeqExpr;
 import com.marklogic.client.type.SemBlankSeqExpr;
 import com.marklogic.client.type.SemUnknownExpr;
 import com.marklogic.client.type.SemUnknownSeqExpr;
 import com.marklogic.client.type.SemIriSeqExpr;
 import com.marklogic.client.type.SemBlankExpr;
 import com.marklogic.client.type.XsBooleanExpr;
 import com.marklogic.client.type.XsQNameExpr;
 import com.marklogic.client.type.ItemExpr;
 import com.marklogic.client.type.XsDateTimeExpr;
 import com.marklogic.client.type.ItemSeqExpr;


// IMPORTANT: Do not edit. This file is generated. 
public interface Sem extends SemValue {
    public SemBlankExpr bnode();
    public SemBlankExpr bnode(XsAnyAtomicTypeExpr value);
    public ItemSeqExpr coalesce(ItemExpr... parameter1);
    public SemIriExpr datatype(XsAnyAtomicTypeExpr value);
    public SemIriExpr defaultGraphIri();
    public ItemSeqExpr ifExpr(boolean condition, ItemSeqExpr then, ItemExpr... elseExpr);
    public ItemSeqExpr ifExpr(XsBooleanExpr condition, ItemSeqExpr then, ItemSeqExpr elseExpr);
    public SemInvalidExpr invalid(String string, SemIriExpr datatype);
    public SemInvalidExpr invalid(XsStringExpr string, SemIriExpr datatype);
    public SemIriExpr invalidDatatype(SemInvalidExpr val);
    public SemIriExpr iri(XsAnyAtomicTypeExpr stringIri);
    public XsQNameExpr iriToQName(XsStringExpr arg1);
    public XsBooleanExpr isBlank(XsAnyAtomicTypeExpr value);
    public XsBooleanExpr isIRI(XsAnyAtomicTypeExpr value);
    public XsBooleanExpr isLiteral(XsAnyAtomicTypeExpr value);
    public XsBooleanExpr isNumeric(XsAnyAtomicTypeExpr value);
    public XsStringExpr lang(XsAnyAtomicTypeExpr value);
    public XsBooleanExpr langMatches(XsStringExpr langTag, String langRange);
    public XsBooleanExpr langMatches(XsStringExpr langTag, XsStringExpr langRange);
    public SemIriExpr QNameToIri(XsQNameExpr arg1);
    public XsDoubleExpr random();
    public XsBooleanExpr sameTerm(XsAnyAtomicTypeExpr a, XsAnyAtomicTypeExpr b);
    public XsStringExpr timezoneString(XsDateTimeExpr value);
    public XsAnyAtomicTypeExpr typedLiteral(String value, SemIriExpr datatype);
    public XsAnyAtomicTypeExpr typedLiteral(XsStringExpr value, SemIriExpr datatype);
    public SemUnknownExpr unknown(String string, SemIriExpr datatype);
    public SemUnknownExpr unknown(XsStringExpr string, SemIriExpr datatype);
    public SemIriExpr unknownDatatype(SemUnknownExpr val);
    public SemIriExpr uuid();
    public XsStringExpr uuidString();     public SemBlankSeqExpr blank(SemBlankExpr... items);
     public SemInvalidSeqExpr invalid(SemInvalidExpr... items);
     public SemIriSeqExpr iri(SemIriExpr... items);
     public SemUnknownSeqExpr unknown(SemUnknownExpr... items);

}
