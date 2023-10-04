package co.unbosque.model;

import java.util.ArrayList;
import java.util.List;

public class Fachada {
    private List<Heroes> heroesList;
    private Mortales mortales;
    private Desterrados desterrados;

    public Fachada() {
        // Inicializa la lista de héroes, mortales y desterrados
        heroesList = new ArrayList<>();
        heroesList.add(new Heroes("Kira",700, 3.0, "Azul", true));
        heroesList.add(new Heroes("Astar", 1000, 3.0, "Rojo", true));
        mortales = new Mortales("Cristian", 25, 1.75, "Violetas", true, "Ingeniero", "FamiliaX");
        desterrados = new Desterrados("Renk", 1200, 2.0, "Gris", false);
    }

    public String obtenerInformacionHeroes() throws Exception{
    	
        StringBuilder info = new StringBuilder();
        try {
        	
        	for (Heroes hero : heroesList) {
            	if(hero.getEstatura() != 3.0) {
            		throw new IllegalArgumentException("La estatura no es igual a 3.0.");
            	}
            		info.append("NOMBRE: ").append(hero.getNombre()).append("\nEDAD: ").append(hero.getEdad())
                    .append("\nESTATURA METROS: ").append(hero.getEstatura()).append("\nCOLOR DE OJOS: ")
                    .append(hero.getColorDeOjos()).append("\nALMA: ").append(hero.isAlma()).append("\nVOLAR: ")
                    .append(hero.volarPorLosAires()).append("\nFUEGO: ").append(hero.crearFuegoConLasManos())
                    .append("\nTIEMPO: ").append(hero.detenerElTiempo()).append("\nSENTIR: ").append(hero.sentir())
                    .append("\nHABITAR: ").append(hero.habitar()).append("\n\n");
            }
            return info.toString();
			
		} catch (Exception e) {
			return e.getMessage(); // 
		}
        
    } 

    public String obtenerInformacionDesterrados() throws Exception {
    	try {
    		if (!desterrados.getNombre().equals("Renk")) {
    			throw new IllegalArgumentException("El nombre no es igual a Renk.");
    		}
        String informacion = "NOMBRE: " + desterrados.getNombre() + "\nEDAD: " + desterrados.getEdad()
            + "\nESTATURA: " + desterrados.getEstatura() + "\nCOLOR DE OJOS: " + desterrados.getColorDeOjos()
            + "\nALMA: " + desterrados.isAlma() + "\nSER: " + desterrados.serTriste()
            + "\nRECHAZADOS: " + desterrados.serRechazadosPorKublaKan() + "\nSENTIR: " + desterrados.sentir()
            + "\nHABITAR: " + desterrados.habitar() + "\nVIVIR: " + desterrados.vivir();

        	return informacion;
		} catch (Exception e) {
			return e.getMessage();
		}
    		
    }
    
    public String obtenerInformacionMortales() throws Exception {
        try {
            if (!mortales.getColorDeOjos().equals("Violetas")) {
                throw new IllegalArgumentException("El color de ojos de los mortales no se puede ser diferentes a violetas.");
            }
            String info = "NOMBRE: " + mortales.getNombre() + "\nEDAD: " + mortales.getEdad()
                + "\nESTATURA: " + mortales.getEstatura() + "\nCOLOR DE OJOS: " + mortales.getColorDeOjos()
                + "\nALMA: " + mortales.isAlma() + "\nFAMILIA: " + mortales.getFamilia()
                + "\nPROFESION: " + mortales.getProfesion() + "\nCONOCIMIENTOS: " + mortales.adquirirConocimientos()
                + "\nFAMILIA: " + mortales.tenerFamilia() + "\nEJERCER PROFESION: " + mortales.ejercerProfesion()
                + "\nSENTIR: " + mortales.sentir() + "\nHABITAR: " + mortales.habitar();
                
            return info;
        } catch (NullPointerException e) {
            return "No se pudo extraer la información. Algunos datos son nulos.";
        } catch (IllegalArgumentException e) {
            return e.getMessage(); // 
        }
    }

    public List<Heroes> getHeroesList() {
        return heroesList;
    }

    public void setHeroesList(List<Heroes> heroesList) {
        this.heroesList = heroesList;
    }

    public Mortales getMortales() {
        return mortales;
    }

    public void setMortales(Mortales mortales) {
        this.mortales = mortales;
    }

    public Desterrados getDesterrados() {
        return desterrados;
    }

    public void setDesterrados(Desterrados desterrados) {
        this.desterrados = desterrados;
    }
}
