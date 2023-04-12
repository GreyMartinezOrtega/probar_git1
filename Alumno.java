class Alumno{
      //atributos
      private int nm;
      private String nombre;
      //constructor
      public Alumno(int nm, String nombre){
         this.nm = nm;
         this.nombre = nombre;
      }
      //métodos
      public int getNm(){
         return nm;
      }
      public String getNombre(){
         return nombre;
      }
      public String toString(){
         return "Alumno[nm="+nm+", nombre="+nombre+"]";
      }
}