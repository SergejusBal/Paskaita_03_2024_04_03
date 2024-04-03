import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /////////////////////////////////////////////
        /////////// Užduotis bendra 1
        System.out.println();
        System.out.println("Užduotis bendra 1");
        System.out.println();

        int[] pazymiai = new int[] {8, 5, 5, 3, 8, 7, 7, 8, 2, 5, 2, 3, 8, 9, 3, 7, 10, 4, 9, 6};

        //System.out.println(" "+ pazymiai[4]);

        int perlaikimas = 0;
        int rekomendacijas =0;

        for(int i = 0; i < pazymiai.length; i++) {

            if (pazymiai[i] < 5 ) perlaikimas++;
            else if (pazymiai[i] >= 7) rekomendacijas++;

            }
        System.out.println("Perlaikyti: "+perlaikimas);
        System.out.println("Rekomendacija: "+rekomendacijas);

        /////////////////////////////////////////////
        /////////// Užduotis bendra 2

        System.out.println();
        System.out.println("Užduotis bendra 2");
        System.out.println();

        int[] masivas8Sveiki = new int[16];
        boolean[] tikrinti = new boolean[masivas8Sveiki.length/2];

        Random random = new Random();
        for (int i = 0; i <masivas8Sveiki.length;i++){
            masivas8Sveiki[i] = random.nextInt(0,10);
            System.out.println(masivas8Sveiki[i]);
        }

        for (int i = 0; i<tikrinti.length;i++){
            if(masivas8Sveiki[i*2]==masivas8Sveiki[i*2+1]) tikrinti[i] = true;
            else tikrinti[i] = false;

        }

        for (int i = 0; i<tikrinti.length;i++){
            System.out.println(tikrinti[i]);
        }

        /////////////////////////////////////////////
        /////////// Užduotis bendra 3

        System.out.println();
        System.out.println("Užduotis bendra 3");
        System.out.println();

        List<String> vardai = new ArrayList<String>();
        vardai.add("Jonas");
        vardai.add("Mantas");
        vardai.add("Aiste");


        vardai.sort(Comparator.naturalOrder());

        for(String s : vardai) {
            System.out.println(s);
        }

        for(int j = 0; j < vardai.size(); j++){
            System.out.println(vardai.get(j));
        }


        /////////////////////////////////////////////
        /////////// Užduotis bendra 4

        System.out.println();
        System.out.println("Užduotis bendra 4");
        System.out.println();

        Set<String> kolekcija = new HashSet<String>();

        kolekcija.add("Du");
        kolekcija.add("gaideliai");
        kolekcija.add("du");
        kolekcija.add("gaideliai");
        kolekcija.add("baltus");
        kolekcija.add("žirnius");
        kolekcija.add("kūlė");
        kolekcija.add("Du");

        System.out.println();
        System.out.println(kolekcija);


        System.out.println();
        for(String s : kolekcija){
            System.out.println(s);
        }


        System.out.println();
        Iterator iterator = kolekcija.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        /////////////////////////////////////////////
        /////////// Užduotis 5

        System.out.println();
        System.out.println("Užduotis bendra 5");
        System.out.println();

        Map<Integer, String> planets = new HashMap<Integer, String>();
        planets.put(1,"Merkurijus");
        planets.put(2,"Venera");
        planets.put(3,"Žemė");
        planets.put(4,"Marsas");
        planets.put(5,"Jupiteris");
        planets.put(6,"Saturnas");
        planets.put(null,"Plutonas");

        if(!planets.get(6).isEmpty()) planets.remove(6); // arba planets.containsKey(6);

        List<Object> Skirtingos = new ArrayList<>();
        Skirtingos.add(vardai.get(0));
        Skirtingos.add(kolekcija.iterator().next());
        Skirtingos.add(planets.get(1));

        System.out.println(Skirtingos);



        System.out.println(planets);


        /////////////////////////////////////////////
        /////////// Užduotis bendra 6

        System.out.println();
        System.out.println("Užduotis 6");
        System.out.println();

        Mokinys jonas = new Mokinys("Jonas","Betra",new int[]{7,3,8});
        Mokinys rasa = new Mokinys("Rasa","Jurkute",new int[]{4,10,8});
        Mokinys mantas = new Mokinys("Mantas","Jonkus",new int[]{8,5,1});
        Mokinys inga = new Mokinys("Inga","Berzine",new int[]{8,1,8});

        List<Mokinys> mokyniai = new ArrayList<Mokinys>();
        mokyniai.add(jonas);
        mokyniai.add(rasa);
        mokyniai.add(mantas);
        mokyniai.add(inga);


        Map<String, Float> zurnalas = new HashMap<String, Float>();
        for(Mokinys m : mokyniai){
            zurnalas.put(m.vardas+" "+m.pavarde,m.vidurkis);
        }
        System.out.println();
        System.out.println(zurnalas);



        TreeSet<Float> vidurkiai = new TreeSet<Float>();
        for(Mokinys m : mokyniai){
            vidurkiai.add(m.vidurkis);

        }
        System.out.println();
        System.out.println(vidurkiai);



        System.out.println();
        System.out.println(vidurkiai.last()-vidurkiai.first());

    }

    static class Mokinys {
        String vardas;
        String pavarde;
        int[] pazymiai;
        float vidurkis;
        public Mokinys(String vardas, String pavarde, int[] pazymiai){
            this.vardas = vardas;
            this.pavarde = pavarde;
            this.pazymiai = pazymiai;

            int suma = 0;
            for(Integer i : pazymiai) suma = suma + i;
            vidurkis = suma / (float) pazymiai.length;

        }

    }

}