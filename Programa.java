class Programa{
   public static void main(String[] args){
      Alumno a1= new Alumno(1, "Pepe");
      System.out.println("Número de matrícula="+a1.getNm());
      System.out.println("Nombre="+a1.getNombre());
      System.out.println(a1);
   }
}