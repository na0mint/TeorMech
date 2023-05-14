public class Task2_30 implements Task{
    @Override
    public double compute(String unknown) {
        if(data.get(unknown) != null) {
            return data.get(unknown);
        }

        switch (unknown) {
            case "Rb" -> {
                return (data.get("P") * Math.cos(data.get("Pangle")*(Math.PI/180))) / 2;
            }
            case "Ra" -> {
                return Math.sqrt(Math.pow(data.get("P")*Math.sin(data.get("Pangle")*(Math.PI/180))
                - (data.get("P") * Math.cos(data.get("Pangle")*(Math.PI/180))) / 2, 2)
                + Math.pow(data.get("P") * Math.cos(data.get("Pangle")*(Math.PI/180)), 2));
            }
            default -> {return 0;}
        }
    }
}
