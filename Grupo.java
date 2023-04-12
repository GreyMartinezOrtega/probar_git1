import java.util.ArrayList;

class Grupo
{
   //atributos
   private String nombreGrupo;
   private ArrayList<Alumno> alumnos;
   //constructor
   public Grupo(String nombreGrupo){
      this.nombreGrupo = nombreGrupo;
      alumnos= new ArrayList<>();
   }
   //método
   public void add(Alumno a){
      alumnos.add(a);
   }
   public String toString(){
      return "Grupo [nombreGrupo="+nombreGrupo+", alumnos="+alumnos+"]";
   }
}