class typeConversion {
    public static void main(String args[]){
        double floatValue = 345.44;

        int intValue = 45;

        // changing integer type to double

        double changedIntValue = intValue;
        int changedDoubleValue = (int)floatValue;

        System.out.println(changedIntValue);
        System.out.println(changedDoubleValue);

    }
}