package EstruturaBasicaPOO;

 public class Aplicacao {

    public static void main(String[] args) {
         Carro carro1 = new Carro("Azul", "Fiat Cronos", 52);

         /*carro1.setCor("Azul.");
         carro1.setModelo("Fiat cronos");
         carro1.setCapacidadeTanque(52);*/

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println("R$" + carro1.totalValorTanque(6.50));

        Carro carro2 = new Carro("Cinza", "Saveiro", 63 );

        System.out.println("\n" + carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println("R$" + carro2.totalValorTanque(6.50));

    }
}
