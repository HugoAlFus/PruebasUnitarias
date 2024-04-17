public class Empleado {

    public double calculaSalariBrut( String tipusEmpleat, double vendesMes, int horesExtra) throws MaException {

        double salarioBase;
        double primas;
        double salarioBruto;

        if(vendesMes < 0 || horesExtra < 0){
            throw new MaException("El valor no puede ser negativo");
        }

        if(tipusEmpleat != null){
            if(tipusEmpleat.equalsIgnoreCase("Venedor")){
                salarioBase = 1000;
            } else if(tipusEmpleat.equalsIgnoreCase("Encarregat")){
                salarioBase = 1500;
            }else throw new MaException("El tipus de venedor no es correcte");
        } else throw new MaException("El tipus de venedor no es correcte");

        if(vendesMes >= 1000 && vendesMes < 2500){
            primas = 100;
        } else if(vendesMes >= 2500){
            primas = 200;
        } else primas = 0;

        salarioBruto = (salarioBase + primas) + (horesExtra * 18.57);
        return salarioBruto;
    }

    public double calculaSalariNet(double salariBrut) throws MaException {

        double salarioNet;
        int retencion = 0;

        if(salariBrut < 0){
            throw new MaException("El salario bruto no puede ser negativo");
        }
        if(salariBrut >= 1000 && salariBrut <= 1500){
            retencion = 16;
        } else if (salariBrut >= 1501) {
            retencion = 20;
        }
        salarioNet = (salariBrut * (100 - retencion)) / 100;

        if(salarioNet < 0){
            throw new MaException("El valor no puede ser negativo");
        }
        return salarioNet;
    }
}
