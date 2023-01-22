
package javapsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Data {
     
    
    private int number;

    // child  info
    private String cName;
    private String cMiddle;
    private String cLast;
    private String childSex;
    private int Day;
    private int Month;
    private int Year;
    private String placeOfBirth;
    private String childcityMuni;
    private String childProvince;
    private String typeOfBirth;
    private String multipleBirth;
    private String birthOrder;
    private double babyWeight;

    // mother info
 
    private String mName;
    private String mMiddle;
    private String mLast;
    private String mCitizenship;
    private String mReligion;
    private int alive;
    private int living;
    private int dead;
    private String mOccupation;
    private int motherAge;
    private String houseNo;
    private String mStreet;
    private String mCityMuni;
    private String mProvince;
    
    // father info
    private String fName;
    private String fMiddle;
    private String fLast;
    private String fCitizenship;
    private String fReligion;
    private String fOccupation;
    private int fatherAge;


    // Other Information

    // 18 date and place of marriage
    private String dateOfMarriage;
    private String placeOfMarriage;

        // 19a attendant
    private String attendant;

    // 19b. Certification
    private String namePrint;
    private String address;
    private String titlePosition;
    private String date;

    // 20 informant;
    private String namePrint2;
    private String address2;
    private String relationToChild;
    private String date2;

    // 21 prepared by
    private String namePrint3;
    private String titlePosition3;
    private String date3;

    // 22 recieved by
    private String namePrint4;
    private String titlePosition4;
    private String date4;
    
   

    public int getNumber() {
        return number;
    }

    public String getcName() {
        return cName;
    }

    public String getcMiddle() {
        return cMiddle;
    }

    public String getcLast() {
        return cLast;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcMiddle(String cMiddle) {
        this.cMiddle = cMiddle;
    }

    public void setcLast(String cLast) {
        this.cLast = cLast;
    }

    public String getChildSex() {
        return childSex;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

   

    public String getTypeOfBirth() {
        return typeOfBirth;
    }

    public String getMultipleBirth() {
        return multipleBirth;
    }

    public String getBirthOrder() {
        return birthOrder;
    }

    public double getBabyWeight() {
        return babyWeight;
    }

    public void setChildSex(String childSex) {
        this.childSex = childSex;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

   

    public void setTypeOfBirth(String typeOfBirth) {
        this.typeOfBirth = typeOfBirth;
    }

    public void setMultipleBirth(String multipleBirth) {
        this.multipleBirth = multipleBirth;
    }

    public void setBirthOrder(String birthOrder) {
        this.birthOrder = birthOrder;
    }

    public void setBabyWeight(double babyWeight) {
        this.babyWeight = babyWeight;
    }

    public String getChildcityMuni() {
        return childcityMuni;
    }

    public String getChildProvince() {
        return childProvince;
    }

    public void setChildcityMuni(String childcityMuni) {
        this.childcityMuni = childcityMuni;
    }

    public void setChildProvince(String childProvince) {
        this.childProvince = childProvince;
    }

    public String getmName() {
        return mName;
    }

    public String getmMiddle() {
        return mMiddle;
    }

    public String getmLast() {
        return mLast;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmMiddle(String mMiddle) {
        this.mMiddle = mMiddle;
    }

    public void setmLast(String mLast) {
        this.mLast = mLast;
    }
    
}
