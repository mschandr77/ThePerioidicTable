import java.lang.String;
//import java.util.Arrays;
public class Main {
    int IUPACgroup;
    String groupTitle;
    int columnNumber;
    int periodNumber;
    int atomicNumber;
    String atomicSymbol;
    String elementName;
    double elementMass;

    public Main(int IUPACgroup, String groupTitle, int columnNumber, int periodNumber, int atomicNumber, String atomicSymbol, String elementName, double elementMass) {
        IUPACgroup = IUPACgroup;
        groupTitle = groupTitle;
        columnNumber = columnNumber;
        periodNumber = periodNumber;
        atomicNumber = atomicNumber;
        atomicSymbol = atomicSymbol;
        elementName = elementName;
        elementMass = elementMass;

        public static void doStuff(){
            var Hydrogen = new Main(1, "Alkali Metals", 1, 1, 1, "H", "Hydrogen", 1.01);
//        System.out.println(Hydrogen.toString());
//        Main Helium = new Main(18, "Noble Gases", 1, 1, 2, "He", "Helium", 4.0026);
//        System.out.println(Helium);
//        Main Lithium = new Main(1, "Alkali Metals", 1, 1, 3, "Li", "Lithium", 6.941);
//        System.out.println(Hydrogen);
//        Main Beryllium = new Main(2, "Alkaline Earth Metals", 2, 2, 4, "Be", "Beryllium", 9.0122);
//        System.out.println(Beryllium);
//        Main Boron = new Main(13, "Metalloids", 3, 2, 5, "B", "Boron", 10.81);
//        System.out.println(Boron);
//        Main Carbon = new Main(14, "Reactive Nonmetals", 4, 2, 6, "C", "Carbon", 12.011);
//        System.out.println(Carbon);
//        Main Nitrogen = new Main(15, "Reactive Nonmetals", 5, 2, 7, "N", "Nitrogen", 14.077);
//        System.out.println(Nitrogen);
//        Main Oxygen = new Main(16, "Reactive Nonmetals", 6, 2, 8, "O", "Oxygen", 15.999);
//        System.out.println(Oxygen);
//        Main Fluorine = new Main(17, "Reactive Nonmetals", 7, 2, 9, "F", "Fluorine", 19.998);
//        System.out.println(Fluorine);
//        Main Neon = new Main(18, "Noble Gases", 8, 2, 10, "Ne", "Neon", 20.180);
//        System.out.println(Neon);
//        Main Sodium = new Main(1, "Alkali Metals", 3, 3, 11, "Na", "Sodium", 22.990);
//        System.out.println(Sodium);
//        Main Magnesium = new Main(2, "Alkaline Earth Metals", 2, 2, 12, "Mg", "Magnesium", 24.305);
//        System.out.println(Magnesium);
//        Main Aluminium = new Main(13, "Post Transition Metals", 3, 3, 13, "Al", "Aluminium", 26.982);
//        System.out.println(Aluminium);
//        Main Silicon = new Main(14, "Metalloids", 4, 3, 14, "Si", "Silicon", 28.085);
//        System.out.println(Silicon);
//        Main Phosphorus = new Main(15, "Reactive Nonmetals", 5, 3, 15, "P", "Phosphorous", 30.974);
//        System.out.println(Phosphorus);
//        Main Sulfur = new Main(16, "Reactive Nonmetals", 6, 3, 16, "S", "Sulfur", 32.06);
//        System.out.println(Sulfur);
//        Main Chlorine = new Main(17, "Reactive Nonmetals", 7, 3, 17, "Cl", "Chlorine", 35.45);
//        System.out.println(Chlorine);
//        Main Argon = new Main(18, "Noble Gases", 8, 3, 18, "Ar", "Argon", 39.948);
//        System.out.println(Argon);
//        Main Potassium = new Main(1, "Alkali Metals", 1, 4, 19, "K", "Potassium", 39.098);
//        System.out.println(Potassium);
//        Main Calcium = new Main(2, "Alkaline Earth Metals", 2, 4, 20, "Ca", "Calcium", 40.078);
//        System.out.println(Calcium);
//        Main Scandium = new Main(3, "Transition Metals", 3, 4, 21, "Sc", "Scandium", 44.956);
//        System.out.println(Scandium);
//        Main Titanium = new Main(4, "Transition Metals", 4, 4, 22, "Ti", "Titanium", 47.867);
//        System.out.println(Titanium);
//        Main Vanadium = new Main(5, "Transition Metals", 5, 4, 23, "V", "Vanadium", 50.942);
//        System.out.println(Vanadium);
//        Main Chromium = new Main(6, "Transition Metals", 6, 4, 24, "Cr", "Chromium", 51.996);
//        System.out.println(Chromium);
//        Main Manganese = new Main(7, "Transition Metals", 7, 4, 25, "Mn", "Manganese", 54.938);
//        System.out.println(Manganese);
//        Main Iron = new Main(8, "Transition Metals", 8, 4, 26, "Fe", "Iron", 55.845);
//        System.out.println(Iron);
//        Main Cobalt = new Main(9, "Transition Metals", 9, 4, 27, "Co", "Cobalt", 58.933);
//        System.out.println(Cobalt);
//        Main Nickel = new Main(10, "Transition Metals", 10, 4, 28, "Ni", "Nickel", 58.693);
//        System.out.println(Nickel);
//        Main Copper = new Main(11, "Transition Metals", 11, 4, 29, "Cu", "Copper", 63.546);
//        System.out.println(Copper);
//        Main Zinc = new Main(12, "Transition Metals", 12, 4, 30, "Zn", "Zinc", 65.38);
//        System.out.println(Zinc);
//        Main Gallium = new Main(13, "Post-transition Metals", 13, 4, 31, "Ga", "Gallium", 69.723);
//        System.out.println(Gallium);
//        Main Germanium = new Main(14, "Reactive Nonmetals", 14, 4, 32, "Ge", "Germanium", 72.630);
//        System.out.println(Germanium);
//        Main Arsenic = new Main(15, "Metalloids", 15, 4, 33, "As", "Arsenic", 74.922);
//        System.out.println(Arsenic);
//        Main Selenium = new Main(16, "Reactive Nonmetals", 16, 4, 34, "Se", "Selenium", 78.971);
//        System.out.println(Selenium);
//        Main Bromine = new Main(17, "Reactive Nonmetals", 17, 4, 35, "Br", "Bromine", 79.904);
//        System.out.println(Bromine);
//        Main Krypton = new Main(18, "Noble Gases", 18, 4, 36, "Kr", "Krypton", 83.798);
//        System.out.println(Krypton);
//        Main Rubidium = new Main(1, "Alkali Metals", 1, 1, 37, "Rb", "Rubidium", 85.468);
//        System.out.println(Rubidium);
//        Main Strontium = new Main(2, "Alkaline Earth Metals", 2, 5, 38, "Sr", "Strontium", 87.62);
//        System.out.println(Strontium);
//        Main Yttrium = new Main(3, "Transition Metals", 3, 5, 39, "Y", "Yttrium", 88.906);
//        System.out.println(Yttrium);
//        Main Zirconium = new Main(4, "Transition Metals", 4, 5, 40, "Zr", "Zirconium", 91.224);
//        System.out.println(Zirconium);
//        Main Niobium = new Main(5, "Transition Metals", 5, 5, 41, "Nb", "Niobium", 92.906);
//        System.out.println(Niobium);
//        Main Molybdenum = new Main(6, "Transition Metals", 6, 5, 42, "Mo", "Molybdenum", 95.95);
//        System.out.println(Molybdenum);
//        Main Technetium = new Main(7, "Transition Metals", 7, 5, 43, "Tc", "Technetium", 98);
//        System.out.println(Technetium);
//        Main Ruthenium = new Main(8, "Transition Metals", 8, 5, 44, "Ru", "Ruthenium", 101.07);
//        System.out.println(Ruthenium);
//        Main Rhodium = new Main(9, "Transition Metals", 9, 5, 45, "Rh", "Rhodium", 102.91);
//        System.out.println(Rhodium);
//        Main Palladium = new Main(10, "Transition Metals", 10, 5, 46, "Pd", "Palladium", 106.42);
//        System.out.println(Palladium);
//        Main Silver = new Main(11, "Transition Metals", 11, 5, 47, "Ag", "Silver", 107.87);
//        System.out.println(Silver);
//        Main Cadmium = new Main(12, "Transition Metals", 12, 5, 48, "Cd", "Cadmium", 112.41);
//        System.out.println(Cadmium);
//        Main Indium = new Main(13, "Post-transition Metals", 13, 5, 49, "In", "Indium", 114.82);
//        System.out.println(Indium);
//        Main Tin = new Main(14, "Post-transition Metals", 14, 5, 50, "Sn", "Tin", 118.71);
//        System.out.println(Tin);
//        Main Antimony = new Main(15, "Metalloids", 15, 5, 51, "Sb", "Antimony", 121.76);
//        System.out.println(Antimony);
//        Main Tellurium = new Main(16, "Metalloids", 16, 5, 52, "Te", "Tellurium", 127.60);
//        System.out.println(Tellurium);
//        Main Iodine = new Main(17, "Reactive Nonmetals", 17, 5, 53, "I", "Iodine", 126.90);
//        System.out.println(Iodine);
//        Main Xenon = new Main(18, "Noble Gases", 18, 5, 54, "Xe", "Xenon", 131.29);
//        System.out.println(Xenon);
//        Main Caesium = new Main(1, "Alkali Metals", 1, 1, 55, "Cs", "Caesium", 132.91);
//        System.out.println(Caesium);
//        Main Barium = new Main(2, "Alkali Metals", 2, 6, 56, "Ba", "Barium", 137.33);
//        System.out.println(Barium);
//        Main Lanthanum = new Main(19, "Alkali Metals", 19, 6, 57, "La", "Lanthanum", 138.91);
//        System.out.println(Lanthanum);
//        Main Cerium = new Main(19, "Alkali Metals", 19, 6, 58, "Ce", "Cerium", 140.12);
//        System.out.println(Cerium);
//        Main Praseodymium = new Main(19, "Alkali Metals", 19, 6, 59, "Pr", "Praseodymium", 144.24);
//        System.out.println(Praseodymium);
//        Main Neodymium = new Main(19, "Alkali Metals", 19, 6, 60, "Nd", "Neodymium", 144.24);
//        System.out.println(Neodymium);
//        Main Promethium = new Main(19, "Alkali Metals", 19, 6, 61, "Pm", "Promethium", 145);
//        System.out.println(Promethium);
//        Main Samarium = new Main(19, "Alkali Metals", 19, 6, 62, "Sm", "Samarium", 150.36);
//        System.out.println(Samarium);
//        Main Europium = new Main(19, "Alkali Metals", 19, 6, 63, "Eu", "Europium", 151.96);
//        System.out.println(Europium);
//        Main Gadolinium = new Main(19, "Alkali Metals", 19, 6, 64, "Gd", "Gadolinium", 157.25);
//        System.out.println(Gadolinium);
//        Main Terbium = new Main(19, "Alkali Metals", 19, 6, 65, "Tb", "Terbium", 158.93);
//        System.out.println(Terbium);
//        Main Dysprosium = new Main(19, "Alkali Metals", 19, 6, 66, "Dy", "Dysprosium", 162.50);
//        System.out.println(Dysprosium);
//        Main Holmium = new Main(19, "Alkali Metals", 19, 6, 67, "Ho", "Holmium", 164.93);
//        System.out.println(Holmium);
//        Main Erbium = new Main(19, "Alkali Metals", 19, 6, 68, "Er", "Erbium", 167.26);
//        System.out.println(Erbium);
//        Main Thulium = new Main(19, "Alkali Metals", 19, 6, 69, "Tm", "Thulium", 168.93);
//        System.out.println(Thulium);
//        Main Ytterbium = new Main(19, "Alkali Metals", 19, 6, 70, "Yb", "Ytterbium", 173.05);
//        System.out.println(Ytterbium);
//        Main Lutetium = new Main(19, "Alkali Metals", 19, 6, 71, "Lu", "Lutetium", 174.97);
//        System.out.println(Lutetium);
//        Main Hafnium = new Main(4, "Transition Metals", 3, 6, 72, "Hf", "Hafnium", 178.49);
//        System.out.println(Hafnium);
//        Main Tantalum = new Main(5, "Transition Metals", 5, 6, 73, "Ta", "Tantalum", 180.95);
//        System.out.println(Tantalum);
//        Main Tungsten = new Main(6, "Transition Metals", 6, 6, 74, "W", "Tungsten", 183.84);
//        System.out.println(Tungsten);
//        Main Rhenium = new Main(7, "Transition Metals", 7, 6, 75, "Re", "Rhenium", 186.21);
//        System.out.println(Rhenium);
//        Main Osmium = new Main(8, "Transition Metals", 8, 6, 76, "Os", "Osmium", 190.23);
//        System.out.println(Osmium);
//        Main Iridium = new Main(9, "Transition Metals", 9, 6, 77, "Ir", "Iridium", 192.22);
//        System.out.println(Iridium);
//        Main Platinum = new Main(10, "Transition Metals", 10, 6, 78, "Pt", "Platinum", 195.08);
//        System.out.println(Platinum);
//        Main Gold = new Main(11, "Transition Metals", 11, 6, 79, "Au", "Gold", 196.97);
//        System.out.println(Gold);
//        Main Mercury = new Main(12, "Transition Metals", 12, 6, 80, "Hg", "Mercury", 200.59);
//        System.out.println(Mercury);
//        Main Thallium = new Main(13, "Post-transition Metals", 13, 6, 81, "Tl", "Thallium", 204.38);
//        System.out.println(Thallium);
//        Main Lead = new Main(14, "Post-transition Metals", 14, 6, 82, "Pb", "Lead", 207.2);
//        System.out.println(Lead);
//        Main Bismuth = new Main(15, "Post-transition Metals", 15, 6, 83, "Bi", "Bismuth", 208.98);
//        System.out.println(Bismuth);
//        Main Polonium = new Main(16, "Post-transition Metals", 16, 6, 84, "Po", "Polonium", 209);
//        System.out.println(Polonium);
//        Main Astatine = new Main(17, "Reactive Nonmetals", 17, 6, 85, "At", "Astatine", 210);
//        System.out.println(Astatine);
//        Main Radon = new Main(18, "Actinoids", 18, 6, 86, "Rn", "Radon", 222);
//        System.out.println(Radon);
//        Main Francium = new Main(1, "Alkali Metals", 1, 1, 87, "Fr", "Francium", 223);
//        System.out.println(Francium);
//        Main Radium = new Main(2, "Alkaline Earth Metals", 2, 6, 88, "Ra", "Radium", 226);
//        System.out.println(Radium);
//        Main Actinium = new Main(0, "Actinoids", 0, 7, 89, "Ac", "Actinium", 227);
//        System.out.println(Actinium);
//        Main Thorium = new Main(0, "Actinoids", 0, 7, 90, "Th", "Thorium", 232.04);
//        System.out.println(Thorium);
//        Main Protactinium = new Main(0, "Actinoids", 0, 7, 91, "Pa", "Protactinium", 231.04);
//        System.out.println(Protactinium);
//        Main Uranium = new Main(0, "Actinoids", 0, 7, 92, "U", "Uranium", 238.03);
//        System.out.println(Uranium);
//        Main Neptunium = new Main(0, "Actinoids", 0, 7, 93, "Np", "Neptunium", 237);
//        System.out.println(Neptunium);
//        Main Plutonium = new Main(0, "Actinoids", 0, 7, 94, "Pu", "Plutonium", 244);
//        System.out.println(Plutonium);
//        Main Americium = new Main(0, "Actinoids", 0, 7, 95, "Am", "Americium", 243);
//        System.out.println(Americium);
//        Main Curium = new Main(0, "Actinoids", 0, 7, 96, "Cm", "Curium", 247);
//        System.out.println(Curium);
//        Main Berkelium = new Main(0, "Actinoids", 0, 7, 97, "Bk", "Berkelium", 247);
//        System.out.println(Berkelium);
//        Main Californium = new Main(0, "Actinoids", 0, 7, 98, "Cf", "Californium", 251);
//        System.out.println(Californium);
//        Main Einsteinium = new Main(0, "Actinoids", 0, 7, 99, "Es", "Einsteinium", 252);
//        System.out.println(Einsteinium);
//        Main Fermium = new Main(0, "Actinoids", 0, 7, 100, "Fm", "Fermium", 257);
//        System.out.println(Fermium);
//        Main Mendelevium = new Main(0, "Actinoids", 0, 7, 101, "Md", "Mendelevium", 258);
//        System.out.println(Mendelevium);
//        Main Nobelium = new Main(0, "Actinoids", 0, 7, 102, "No", "Nobelium", 259);
//        System.out.println(Nobelium);
//        Main Lawrencium = new Main(0, "Actinoids", 0, 7, 103, "Lr", "Lawrencium", 266);
//        System.out.println(Lawrencium);
//        Main Rutherfordium = new Main(4, "Transition Metals", 4, 7, 104, "Rf", "Rutherfordium", 267);
//        System.out.println(Rutherfordium);
//        Main Dubnium = new Main(5, "Transition Metals", 5, 7, 105, "Db", "Dubnium", 268);
//        System.out.println(Dubnium);
//        Main Seaborgium = new Main(6, "Transition Metals", 6, 7, 106, "Sg", "Seaborgium", 269);
//        System.out.println(Seaborgium);
//        Main Bohrium = new Main(7, "Transition Metals", 7, 7, 107, "Bh", "Bohrium", 270);
//        System.out.println(Bohrium);
//        Main Hassium = new Main(8, "Transition Metals", 8, 7, 108, "Hs", "Hassium", 277);
//        System.out.println(Hassium);
//        Main Meitnerium = new Main(9, "N/A", 9, 7, 109, "Mt", "Meitnerium", 278);
//        System.out.println(Meitnerium);
//        Main Darmstadtium = new Main(10, "N/A", 10, 7, 110, "Ds", "Darmstadtium", 281);
//        System.out.println(Darmstadtium);
//        Main Roentgenium = new Main(11, "N/A", 11, 7, 111, "Rg", "Roentgenium", 282);
//        System.out.println(Roentgenium);
//        Main Copernicium = new Main(12, "N/A", 12, 7, 112, "Cn", "Copernicium", 285);
//        System.out.println(Copernicium);
//        Main Nihonium = new Main(13, "N/A", 13, 7, 113, "Nh", "Nihonium", 286);
//        System.out.println(Nihonium);
//        Main Flerovium = new Main(14, "N/A", 14, 7, 114, "Fl", "Flerovium", 289);
//        System.out.println(Flerovium);
//        Main Moscovium = new Main(15, "N/A", 15, 7, 115, "Mc", "Moscovium", 290);
//        System.out.println(Moscovium);
//        Main Livermorium = new Main(16, "N/A", 16, 7, 116, "Lv", "Livermorium", 293);
//        System.out.println(Livermorium);
//        Main Tennessine = new Main(17, "N/A", 17, 7, 117, "Ts", "Tennessine", 294);
//        System.out.println(Tennessine);
//        Main Oganesson = new Main(18, "N/A", 18, 7, 118, "Og", "Oganesson", 294);
//        System.out.println(Oganesson);
        }
    }

    @Override
        public String toString () {
            return IUPACgroup + "\n" + groupTitle + "\n" + columnNumber + "\n" + periodNumber + '\n' + atomicNumber + '\n' + atomicSymbol + '\n' + elementName + '\n' + elementMass + '\n';
        }
        public static void thisElement ( int IUPACgroup, String groupTitle,int columnNumber, int periodNumber, int atomicNumber, String atomicSymbol, String elementName,double elementMass){
            var Hydrogen = new Main(1, "Alkali Metals", 1, 1, 1, "H", "Hydrogen", 1.01);
            System.out.println(Hydrogen);
        }
    }






