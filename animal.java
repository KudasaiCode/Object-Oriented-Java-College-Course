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
                  "patas   = " totalDePatas + "\n" +
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

public class polimorfismoEjemplo1 {
    public static void main (String args []) {
        Animal [] listaDeAnimales = new aAnimal[3];
        listaDeAnimales[0] = new Perro();
        listaDeAnimales[1] = new Gato();
        listaDeAnimales[2] = new Gallo();


        
    }
}