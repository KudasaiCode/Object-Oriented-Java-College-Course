class Animal {
        String especie = "";
        int totalDePatas = 0;
        boolean tieneEscamas = false, 
        tienePelo = false, 
        tienePlumas = false, 
        tieneSangreCaliente = false;
        String sonido;

        Animal(int totPatas, boolean escamas, 
            boolean pelo, boolean plumas, 
            boolean sangreCaliente) 
        {
            this.totalDePatas = totPatas;
            this.tieneEscamas = escamas;
            this.tienePelo = pelo;
            this.tienePlumas = plumas;
            this.tieneSangreCaliente = sangreCaliente;
        }

        void setEspecie (String especie) {
           this.especie = especie;
        }

        String getEspecie() {
                return (especie);
        }

        void hacerSonido () {
        }

        String getSonido () {
            return (sonido);
        }

         public String toString() {
            String str;
            str = "Especie = " + especie + "\n" +
                  "patas   = " + totalDePatas + "\n" +
                  "escamas = " + tieneEscamas + "\n" +
                  "pelo   = " + tienePelo + "\n" +
                  "plumas = " + tienePlumas + "\n" +
                  "sand. cal = " + tieneSangreCaliente;
            return (str);
         }   
}

class Mamifero extends Animal {
    Mamifero () {
        super(4, false, true, false, true);
    }
}
class Ave extends Animal {
    Ave(){
        super(2, true, false, true, true);
    }
}

class Perro extends Mamifero { 
    Perro () {
        especie = "perro";
    }

    // implementa metodo hacerSonidio()
    //haciendo un override a la clase Animal
    void hacerSonido() {
        System.out.println("Guau guau");
    }
}

class Gato extends Mamifero {
    Gato() {
        especie = "gato";
    }

    // override hacerSonido() in class Animal
    void hacerSonido() {
        System.out.println("Miau miau");
    }
}

class Gallo extends Ave {
    Gallo() {
        especie = "gallo";
    }

    // override hacerSonido() in class Animal
    void hacerSonido() {
        sonido = "cucurucucuuuuu";
    }

    void escarbar() {
        //empty
    }
}

class Reptile extends Animal {
   Reptile {
      super(0,true,false,false,true);
   }
}

class Snake extends Reptile {
   Snake() {
      especie = "snake";
   }
   
   hacerSonido() {
      sonido = "zzzzzzzzz";
   }
}

class Crocodile extends Reptile {
   Crocodile {
      especie = "Crocodile";
      totalDePatas = 4;
   }
}
      

public class polimorfismoEjemplo1 {
    public static void main (String args []) {
        Animal [] listaDeAnimales = new Animal[5];
        listaDeAnimales[0] = new Perro();
        listaDeAnimales[1] = new Gato();
        listaDeAnimales[2] = new Gallo();
        listaDeAnimales[3] = new Snake();
        listaDeAnimales[4] = new Crocodile();
        
        System.out.println(listaDeAnimales[0] + "\n");
        System.out.println(listaDeAnimales[1] + "\n");       
        System.out.println(listaDeAnimales[2] + "\n"); 
        
        listaDeAnimales[0].hacerSonido();
        listaDeAnimales[1].hacerSonido();
        listaDeAnimales[2].hacerSonido();
        
        System.out.println("Sonido del gallo: " +
                           listaDeAnimales[2].getSonido());
    }
}