public class Task2_30 implements Task{
    @Override
    public double compute(String unknown) {
        if(data.get(unknown) != null) {
            return data.get(unknown);
        }

        if(unknown.equals("Rb")) {
            return (data.get("P") * Math.cos(data.get("Pangle")*(Math.PI/180))) / 2;
        }




        return 0;
    }
}
