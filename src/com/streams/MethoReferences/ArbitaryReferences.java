package com.streams.MethoReferences;

import java.util.ArrayList;
import java.util.List;

class Company{
    String companyName;
    int year;

    Company(String companyName, int year){
        this.companyName= companyName.toString();
        this.year = year;
    }

    public String getCompanyName(){
        return companyName;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString(){
        return "Company{"+
                "Company Name = '" + companyName + '\''+
                ", Company Year = " + year +
                "}";
    }
}
public class ArbitaryReferences {
    public static void main(String args[]){
        List<Company> lst = new ArrayList<>();
        lst.add(new Company("Wieland IT Solution", 4));
        lst.add(new Company("Blue Yonder", 5));
        lst.add(new Company("SWAN", 10));

        // Getting the year of the companys in a stream
        int totalNumberOfYears = lst.stream().mapToInt(s -> s.getYear()).sum();

        // Arbitary Object Method Reference
        int totalNumberOfYearsWithMethodReference = lst.stream().mapToInt(Company::getYear).sum();

    }
}
