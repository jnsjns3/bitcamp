package bitcamp.java100.ch20.ex5;

import java.sql.Date;

public class MyClass {

    String varStr;
    
    int varInt;
    long varLong;
    short varShort;
    float varFloat;
    double varDouble;
    boolean varBoolean;
    char varChar;
    Date varDate;
    
  
    
   
    @Override
    public String toString() {
        return "MyClass [varStr=" + varStr + ", varInt=" + varInt + ", varLong=" + varLong + ", varShort=" + varShort
                + ", varFloat=" + varFloat + ", varDouble=" + varDouble + ", varBoolean=" + varBoolean + ", varChar="
                + varChar + ", varDate=" + varDate + "]";
    }


    public Date getVarDate() {
        return varDate;
    }


    public void setVarDate(Date varDate) {
        this.varDate = varDate;
    }


    public String getVarStr() {
        return varStr;
    }
    public void setVarStr(String varStr) {
        this.varStr = varStr;
    }
    public int getVarInt() {
        return varInt;
    }
    public void setVarInt(int varInt) {
        this.varInt = varInt;
    }
    public long getVarLong() {
        return varLong;
    }
    public void setVarLong(long varLong) {
        this.varLong = varLong;
    }
    public short getVarShort() {
        return varShort;
    }
    public void setVarShort(short varShort) {
        this.varShort = varShort;
    }
    public float getVarFloat() {
        return varFloat;
    }
    public void setVarFloat(float varFloat) {
        this.varFloat = varFloat;
    }
    public double getVarDouble() {
        return varDouble;
    }
    public void setVarDouble(double varDouble) {
        this.varDouble = varDouble;
    }
    public boolean isVarBoolean() {
        return varBoolean;
    }
    public void setVarBoolean(boolean varBoolean) {
        this.varBoolean = varBoolean;
    }
    public char getVarChar() {
        return varChar;
    }
    public void setVarChar(char varChar) {
        this.varChar = varChar;
    }
    
    
    
    
    
}
