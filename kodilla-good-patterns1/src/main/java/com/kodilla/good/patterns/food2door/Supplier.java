package com.kodilla.good.patterns.food2door;

public class Supplier{

    private String nameOfSupplier;
    private int supplierID;

    public Supplier(String nameOfSupplier, int supplierID) {
        this.nameOfSupplier = nameOfSupplier;
        this.supplierID = supplierID;
    }

    public String getNameOfSupplier() {
        return nameOfSupplier;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setNameOfSupplier(String nameOfSupplier) {
        this.nameOfSupplier = nameOfSupplier;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        if (supplierID != supplier.supplierID) return false;
        return nameOfSupplier.equals(supplier.nameOfSupplier);
    }

    @Override
    public int hashCode() {
        int result = nameOfSupplier.hashCode();
        result = 31 * result + supplierID;
        return result;
    }

    @Override
    public String toString() {
        return "Supplier: " + nameOfSupplier +
                ", " + supplierID ;
    }


}
