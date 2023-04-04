

//angle - угол между горизонтальной составляющей силы и радиусом
// сферынаправленный к точке соприкосновения с телом;
//AB -

public class Task_2_24 implements Task{
    @Override
    public double compute(String unknown) {
        if (data.get(unknown) != null){
            return data.get(unknown);
        }
        switch (unknown){
            case "angle":
                return Math.asin((data.get("R") - data.get("l")) / data.get("R"));
            case "AB":
                return Math.sin(90 - data.get("angle")) * data.get("R");
            case "P":
                return data.get("mg") * data.get("AB") / (data.get("R") - data.get("l"));
            default:
                return 0;
        }
    }
}
