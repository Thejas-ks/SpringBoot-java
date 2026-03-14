package com.example.SpringMiniProject.dto.response;

public class CustomerResponse {

    private String name;
    private int total;
    private double gst;
    private int netTotal;

    public CustomerResponse(String name, int total, double gst, int netTotal) {
        this.name = name;
        this.total = total;
        this.gst = gst;
        this.netTotal = netTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public int getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(int netTotal) {
        this.netTotal = netTotal;
    }

   

    
    
    
}
