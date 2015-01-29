/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.entity.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashMap;

/**
 * Description: CountryMap
 * Author: liuzh
 * Update: liuzh(2014-06-06 13:38)
 */
@Table(name = "country")
public class CountryMap extends HashMap<String, Object> {
    @Id
    private Integer id;
    @Column
    private String countryname;
    private String countrycode;

    public Integer getId() {
        return (Integer) get("ID");
    }

    public void setId(Integer id) {
        put("ID", id);
    }

    public String getCountryname() {
        return (String) get("COUNTRYNAME");
    }

    public void setCountryname(String countryname) {
        put("COUNTRYNAME", countryname);
    }

    public String getCountrycode() {
        return (String) get("COUNTRYCODE");
    }

    public void setCountrycode(String countrycode) {
        put("COUNTRYCODE", countrycode);
    }

    @Override
    public String toString() {
        return "Country{" +
                "ID=" + getId() +
                ", COUNTRYNAME='" + getCountryname() + '\'' +
                ", COUNTRYCODE='" + getCountrycode() + '\'' +
                '}';
    }
}
