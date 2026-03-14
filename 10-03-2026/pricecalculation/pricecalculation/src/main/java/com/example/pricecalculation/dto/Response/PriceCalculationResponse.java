package com.example.pricecalculation.dto.Response;

public class PriceCalculationResponse {

    private String cutomerName;
    private int custId;
    private int total;
    private  double gst;
    private double nettotal;

    public PriceCalculationResponse(String cutomerName, int custId, int total, double gst, double nettotal) {
        this.cutomerName = cutomerName;
        this.custId = custId;
        this.total = total;
        this.gst = gst;
        this.nettotal = nettotal;
    }
    public String getCutomerName() {
        return cutomerName;
    }
    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
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
    public void setGst(int gst) {
        this.gst = gst;
    }
    public double getNettotal() {
        return nettotal;
    }
    public void setNettotal(double nettotal) {
        this.nettotal = nettotal;
    }

    
    
}
