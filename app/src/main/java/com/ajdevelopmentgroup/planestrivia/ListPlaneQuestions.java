package com.ajdevelopmentgroup.planestrivia;

import java.util.ArrayList;
import java.util.Collections;

public class ListPlaneQuestions {

    private ArrayList<Question> Questions = new ArrayList<Question>();

    public ListPlaneQuestions() {






    }

    public void addQuestion(Question question){

        Questions.add(question);


    }

    public ArrayList<Question> getQuestions() {

        return Questions;

    }
    public Question getQuestionAtIndex(int index){

        return Questions.get(index);

    }

    public void randomizeList(){

        Collections.shuffle(Questions);


    }
    public void planesTypesQuestions(){
        addQuestion(new Question("Airbus A330", "https://upload.wikimedia.org/wikipedia/commons/e/ef/Dragonair_Airbus_A330-300_Prasertwit-1.jpg", new String[]{"Airbus A330", "Boeing 767", "Airbus A340", "Airbus A320"}));
        addQuestion(new Question("Boeing 737", "https://upload.wikimedia.org/wikipedia/commons/0/0b/Ryanair_EI-DHD_B737-800_EMA_%2841597189121%29.jpg", new String[]{"Airbus A220", "Boeing 737", "CRJ-200", "Airbus A320"}));
        addQuestion(new Question("Boeing 787", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Qantas_Boeing_787-9_VH-ZNA_%2840626785014%29.jpg/1024px-Qantas_Boeing_787-9_VH-ZNA_%2840626785014%29.jpg", new String[]{"Airbus A330", "Boeing 787", "Airbus A350", "Boeing 767"}));
        addQuestion(new Question("MD-88", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/N402NV_Allegiant_Air_McDonnell_Douglas_MD-88_-_402_%28cn_49763-1626%29_%287213244084%29.jpg/800px-N402NV_Allegiant_Air_McDonnell_Douglas_MD-88_-_402_%28cn_49763-1626%29_%287213244084%29.jpg", new String[]{"MD-88", "Boeing 717", "CRJ-200", "ERJ-175"}));
        addQuestion(new Question("Boeing 717", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Delta_Air_Lines_Boeing_717-2BD_N966AT.jpg/640px-Delta_Air_Lines_Boeing_717-2BD_N966AT.jpg", new String[]{"MD-88", "Boeing 727", "Airbus A220", "Boeing 717"}));
        addQuestion(new Question("Boeing 747", "https://upload.wikimedia.org/wikipedia/commons/7/72/ANA-Boeing_747_25645-979.jpg", new String[]{"Airbus A380", "Boeing 747", "Airbus A340", "Boeing 777"}));
        addQuestion(new Question("Airbus A350", "https://upload.wikimedia.org/wikipedia/commons/d/d6/Qatar_Airways_A350-941_%28A7-ALA%29_landing_at_Frankfurt_Airport.jpg", new String[]{"Airbus A330", "Airbus A340", "Boeing 787", "Airbus A350"}));
        addQuestion(new Question("DC-10", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Continental_Airlines_DC-10.jpg", new String[]{"DC-10", "MD-88", "Boeing 717", "DC-11"} ));
        addQuestion(new Question("Boeing 767", "https://upload.wikimedia.org/wikipedia/commons/6/6f/Qantas_Boeing_767-300ER_VH-OGE_SYD_2011-9-7.png", new String[]{"Boeing 767", "Airbus A330", "Boeing 757", "Boeing 777"}));
        addQuestion(new Question("Boeing 777", "https://upload.wikimedia.org/wikipedia/commons/e/e8/Emirates_Boeing_777-300ER_Spijkers.jpg", new String[]{"Boeing 777", "Boeing 767", "Airbus A330", "Airbus A350"}));
        addQuestion(new Question("Boeing 727", "https://upload.wikimedia.org/wikipedia/commons/c/c8/Boeing_727-30C%2C_Lufthansa_JP5943521.jpg", new String[]{"Boeing 727", "Boeing 717", "MD-88", "Boeing 737"}));
        addQuestion(new Question("Boeing 757", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Icelandair%2C_TF-ISF%2C_Boeing_757-223_%2825766956257%29.jpg/1024px-Icelandair%2C_TF-ISF%2C_Boeing_757-223_%2825766956257%29.jpg", new String[]{"Boeing 757", "Boeing 767", "Airbus A320", "Airbus A330"}));
        addQuestion(new Question("CRJ-700", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Bombardier_CRJ_700_HOP_%2832914489562%29.jpg/1024px-Bombardier_CRJ_700_HOP_%2832914489562%29.jpg", new String[]{"CRJ-700", "ERJ-190", "ERJ-175", "Airbus A220"}));
        addQuestion(new Question("Airbus A220", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/YL-CSD_Bombardier_BD-500-1A100_CS300_BCS3_Airbus_A220-300_A223_c_n_55006_-_BTI_%2831100301167%29.jpg/1024px-YL-CSD_Bombardier_BD-500-1A100_CS300_BCS3_Airbus_A220-300_A223_c_n_55006_-_BTI_%2831100301167%29.jpg", new String[]{"Airbus A220", "Airbus A320", "CRJ-700", "ERJ-145"}));
        addQuestion(new Question("Airbus A340", "https://upload.wikimedia.org/wikipedia/commons/7/76/Thai_Airways_International_Airbus_A340-600_MEL_Creek.jpg", new String[]{"Airbus A340", "Airbus A330", "Boeing 777", "Boeing 787"}));
        addQuestion(new Question("Airbus A380", "https://upload.wikimedia.org/wikipedia/commons/2/25/Airbus_A380-841%2C_Emirates_%28Airbus_Industrie%29_AN0962204.jpg", new String[]{"Airbus A380", "Airbus A340", "Boeing 747", "Boeing 787"}));
        addQuestion(new Question("Airbus A320", "https://upload.wikimedia.org/wikipedia/commons/d/d6/Airbus_A320-214%2C_CSA_-_Czech_Airlines_AN1841815.jpg", new String[]{"Airbus A320", "Airbus A330", "Boeing 737", "Airbus A220"}));
        addQuestion(new Question("Airbus A321", "https://upload.wikimedia.org/wikipedia/commons/5/5a/Airbus_A321-231%2C_Turkish_Airlines_JP5647872.jpg", new String[]{"Airbus A320", "Airbus A321", "Boeing 737", "Boeing 757"}));
        addQuestion(new Question("ERJ-190", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/PH-EZR_KLM_Cityhopper_Embraer_ERJ-190STD_%28ERJ-190-100%29_landing_at_Schiphol_%28EHAM-AMS%29_runway_18R.JPG/640px-PH-EZR_KLM_Cityhopper_Embraer_ERJ-190STD_%28ERJ-190-100%29_landing_at_Schiphol_%28EHAM-AMS%29_runway_18R.JPG", new String[]{"ERJ-190", "ERJ-175", "ERJ-145", "Airbus A220"} ));
        addQuestion(new Question("ERJ-175", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/Embraer_ERJ-175_PLL_LOT.JPG/1200px-Embraer_ERJ-175_PLL_LOT.JPG", new String[]{"ERJ-175", "ERJ-190", "ERJ-145", "Airbus A220"}));
        addQuestion(new Question("ERJ-145", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/BA_CitiExpress_Embraer_ERJ_145_%28G-EMBD%29_departing_Bristol_International_Airport.jpg/1024px-BA_CitiExpress_Embraer_ERJ_145_%28G-EMBD%29_departing_Bristol_International_Airport.jpg", new String[]{"ERJ-175", "ERJ-190", "ERJ-145", "Airbus A220"}));
        addQuestion(new Question("CRJ-200", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/American_Eagle_%28Air_Wisconsin%29_Bombardier_CRJ-200_N457AW_%2837227221340%29.jpg/1024px-American_Eagle_%28Air_Wisconsin%29_Bombardier_CRJ-200_N457AW_%2837227221340%29.jpg", new String[]{"ERJ-175", "CRJ-200", "CRJ-700", "Airbus A220"}));
        addQuestion(new Question("Dash 8-400", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/DASH.8-400_G-JEDR_4087_FLYBE_PURPLE_09_02_15_TLS_%2816217391023%29.jpg/1200px-DASH.8-400_G-JEDR_4087_FLYBE_PURPLE_09_02_15_TLS_%2816217391023%29.jpg", new String[]{"Dash 8-400", "ERJ-190", "CRJ-700", "ATR-72"}));
        addQuestion(new Question("ATR-72", "https://upload.wikimedia.org/wikipedia/commons/4/43/ATR_ATR-72-202%2C_KLM_UK_%28Air_UK%29_AN0198859.jpg", new String[]{"Dash 8-400", "ERJ-190", "CRJ-700", "ATR-72"}));
        addQuestion(new Question("Fokker 70", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Fokker_70%2C_KLM_Cityhopper_JP6825119.jpg/1024px-Fokker_70%2C_KLM_Cityhopper_JP6825119.jpg", new String[]{"Dash 8-400", "ERJ-190", "Fokker 70", "ATR-72"}));



        randomizeList();


    }

    public void airlinesLogosQuestions(){

        addQuestion(new Question("Delta Airlines", "https://1000logos.net/wp-content/uploads/2017/09/Delta-Air-Lines-Logo.png", new String[]{"Delta Airlines", "American Airlines", "United Airlines", "Southwest Airlines"}));
        addQuestion(new Question("United Airlines", "https://banner2.cleanpng.com/20180806/lwu/kisspng-united-airlines-heathrow-airport-2018-vidcon-us-tc-mexico-denver-international-airport-5b6888045fe6b0.1200160415335772203928.jpg", new String[]{"Delta Airlines", "American Airlines", "United Airlines", "Southwest Airlines"}));
        addQuestion(new Question("Korean Air", "https://s3.amazonaws.com/gt7sp-prod/decal/08/40/55/7070665717768554008_1.png", new String[]{"Korean Air", "Air China", "Singapore Airlines", "ANA Airways"} ));
        addQuestion(new Question("Austrian Airlines", "https://www.netclipart.com/pp/m/417-4178422_austrian-airlines-logo-logok.png", new String[]{"Austrian Airlines", "Lufthansa Airlines", "Air France", "KLM"} ));
        addQuestion(new Question("Qatar Airways", "https://airhex.com/images/airline-logos/qatar-airways.png", new String[]{"Qatar Airways", "Emirates Airlines", "Ethiopian Airways", "South African Airways"}));
        addQuestion(new Question("Air China", "https://pbs.twimg.com/profile_images/432063513033310208/4uhKEQVo.jpeg", new String[]{"Korean Air", "Air China", "Singapore Airlines", "ANA Airways"} ));
        addQuestion(new Question("ANA Airways", "https://airhex.com/images/airline-logos/all-nippon-airways.png", new String[]{"Korean Air", "Air China", "Singapore Airlines", "ANA Airways"} ));
        addQuestion(new Question("Ethiopian Airways", "https://www.ethiopianairlines.com/images/default-source/default-album/ethiopiantail.jpg?sfvrsn=35eb16df_3", new String[]{"Qatar Airways", "Emirates Airlines", "Ethiopian Airways",  "South African Airways"}));
        addQuestion(new Question("TAP Airlines", "https://mpng.subpng.com/20181109/vto/kisspng-logo-tap-air-portugal-airline-airbus-a34-5be6410703e2f1.0320252815418165830159.jpg", new String[]{"TAP Airlines", "Iberia Airlines", "Lufthansa Airlines", "Air France"} ));
        addQuestion(new Question("Brussels Airlines", "https://i.pinimg.com/474x/87/c0/66/87c0667552cfd5edcecf1365e7f7f760--brussels-markers.jpg", new String[]{"Air Berlin", "Iberia Airlines", "Lufthansa Airlines", "Brussels Airlines"} ));
        addQuestion(new Question("South African Airways", "https://airhex.com/images/airline-logos/south-african-airways.png", new String[]{"Qatar Airways", "Emirates Airlines", "Ethiopian Airways", "South African Airways"}));
        addQuestion(new Question("Turkish Airlines", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTnEiNUQPL5aJr7ZtCFA7bFFVqbXoovm5FTWXKkkCzcklTLi2I_&usqp=CAU", new String[]{"Turkish Airlines", "Emirates Airlines", "Ethiopian Airways", "South African Airways"}));
        addQuestion(new Question("Scandinavian Airlines", "https://i.pinimg.com/originals/70/7b/86/707b868f5b2b8ab6ec7f0d0b92b2df5a.png", new String[]{"Scandinavian Airlines", "KLM", "Norwegian Airways", "Air France"}));
        addQuestion(new Question("Singapore Airlines", "https://www.logosquizwalkthrough.com/images/meeyo/singapore-airlines.jpg", new String[]{"Singapore Airlines", "Air China", "Cathay Pacific Airlines", "Korean Air"}));
        addQuestion(new Question("Egypt Air", "https://airhex.com/images/airline-logos/egyptair.png", new String[]{"Egypt Air", "Ethiopian Airways", "South African Airways", "Air France"}));
        addQuestion(new Question("Air New Zealand", "https://advinetures.ca/wp-content/uploads/2019/01/AirNZLogo-1.jpg", new String[]{"Air New Zealand", "Air Berlin", "South African Airways", "Air France"}));
        addQuestion(new Question("Iberia Airlines", "https://mpng.subpng.com/20181028/wx/kisspng-iberia-express-logo-airbus-a33-airline-alexgorider-projectfly-5bd59e93accda9.3937242315407264197078.jpg", new String[]{"Iberia Airlines", "Air Berlin", "TAP Airlines", "Air France"}));
        addQuestion(new Question("Emirates Airlines", "https://dwglogo.com/wp-content/uploads/2016/04/emirates_arabic_emblem.png", new String[]{"Qatar Airways", "Emirates Airlines", "Ethiopian Airways",  "Egypt Air"}));
        addQuestion(new Question("Westjet Airlines", "https://pbs.twimg.com/profile_images/1145701560049004544/uJB7ZUgL_400x400.jpg", new String[]{"Westjet Airlines", "Air Canada", "American Airlines",  "Delta Airlines"}));
        addQuestion(new Question("Norwegian Airways", "https://airhex.com/images/airline-logos/norwegian.png", new String[]{"Norwegian Airways", "Scandinavian Airlines", "Iceland Air",  "Austrian Airlines"}));
        addQuestion(new Question("Air Berlin", "https://i.dlpng.com/static/png/417986_preview.png", new String[]{"Air Berlin", "Austrian Airlines", "Air France",  "Norwegian Airways"}));
        addQuestion(new Question("Lufthansa Airlines", "https://www.logo-designer.co/wp-content/uploads/2018/02/2018-new-lufthansa-logo-design-airplane-livery-2.png", new String[]{"Air Berlin", "Iberia Airlines", "Lufthansa Airlines", "Brussels Airlines"}));
        addQuestion(new Question("KLM","https://pbs.twimg.com/media/CZjoAkmUAAAZeXw.png", new String[]{"KLM", "Air France", "Lufthansa Airlines", "Delta Airlines"}));
        addQuestion(new Question("Air France", "https://lh3.googleusercontent.com/3r1hfxzmLVXvCxf9fy2NI39qnZ10zuTHkUHvQg1BRO39ncJOP4SxgzGVhMshQ02qmQ", new String[]{"Air France", "Delta Airlines", "KLM", "Brussels Airlines"}));
        addQuestion(new Question("Hawaiian Airlines", "https://i.pinimg.com/originals/f4/07/2d/f4072d19c56f7cd110d33be50d9ef56d.jpg", new String[]{"Air Berlin", "Hawaiian Airlines", "Singapore Airlines", "Air China"}));
        addQuestion(new Question("Air Canada", "https://i.pinimg.com/originals/a1/da/75/a1da756852e9f1374a70c423ff5e0fe6.jpg", new String[]{"Air Canada", "Westjet Airlines", "United Airlines", "American Airlines"}));
        addQuestion(new Question("Swiss Airlines", "https://pbs.twimg.com/profile_images/875706638879031296/eMyZiGfD_400x400.jpg", new String[]{"Air Berlin", "Swiss Airlines", "Lufthansa Airlines", "Brussels Airlines"}));
        addQuestion(new Question("American Airlines", "https://i.pinimg.com/originals/a2/61/08/a26108757d054158beb1157275db8649.jpg", new String[]{"United Airlines", "Delta Airlines", "American Airlines", "Air Canada"}));
        addQuestion(new Question("Thai Airways", "https://img.favpng.com/1/16/16/bangkok-thai-airways-company-airline-royal-thai-embassy-png-favpng-1cdqNSHU558ebdK6m6e1hJ6yL.jpg", new String[]{"Thai Airways", "Singapore Airlines", "Turkish Airlines", "Air China"}));
        addQuestion(new Question("British Airways", "https://i.pinimg.com/originals/19/2a/d6/192ad6ef6276f56ce4b794111537c724.png", new String[]{"British Airways", "Delta Airlines", "Turkish Airlines", "Norwegian Airways"}));
        addQuestion(new Question("Iceland Air", "https://www.logolynx.com/images/logolynx/5b/5b6a0168284a8e8e3ebbb569d3b29b25.jpeg", new String[]{"Norwegian Airways", "British Airways", "Scandinavian Airlines", "Iceland Air"}));
        addQuestion(new Question("Alaska Airlines", "https://airhex.com/images/airline-logos/alaska-airlines.png", new String[]{"Alaska Airlines", "Air France", "Virgin Airlines", "British Airways"}));
        addQuestion(new Question("Virgin Airlines", "https://img.favpng.com/25/2/21/logo-airplane-virgin-atlantic-virgin-group-airline-png-favpng-TK6LdESYgyTxrshYWynMJAL4K.jpg", new String[]{"Alaska Airlines", "Air France", "Virgin Airlines", "British Airways"}));
        addQuestion(new Question("Ryan Air", "https://airhex.com/images/airline-logos/ryanair.png", new String[]{"Alaska Airlines", "Ryan Air", "Virgin Airlines", "EasyJet"}));
        addQuestion(new Question("EasyJet", "https://4vector.com/i/free-vector-easyjet-airline_070759_easyjet-airline.png", new String[]{"Alaska Airlines", "Ryan Air", "Virgin Airlines", "EasyJet"}));
        addQuestion(new Question("Southwest Airlines", "https://airhex.com/images/airline-logos/southwest-airlines.png", new String[]{"Delta Airlines", "American Airlines", "United Airlines", "Southwest Airlines"}));
        addQuestion(new Question("Cathay Pacific Airlines", "https://pbs.twimg.com/profile_images/531815256188649473/RfMw3xZl.jpeg", new String[]{"Singapore Airlines", "Air China", "Cathay Pacific Airlines", "Korean Air"}));






        randomizeList();


    }

    public void helicopterTypesQuestions(){

        addQuestion(new Question("Eurocopter AS350", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Pastoral_Performance_Pty_Ltd_%28VH-LRW%29_Eurocopter_AS350_B2_at_Wagga_Wagga_Airport_%281%29.jpg/1024px-Pastoral_Performance_Pty_Ltd_%28VH-LRW%29_Eurocopter_AS350_B2_at_Wagga_Wagga_Airport_%281%29.jpg", new String[]{"Eurocopter AS350", "Eurocopter EC135", "Eurocopter EC145", "Sikorsky S-76"}));
        addQuestion(new Question("Bell 407", "https://upload.wikimedia.org/wikipedia/commons/8/80/Bell_407_-N23986.jpg", new String[]{"Eurocopter AS350", "Eurocopter EC135", "Bell 407", "Bell 412"}));
        addQuestion(new Question("Sikorsky S-76", "https://www.flyingmag.com/resizer/WZPA1sAJkI_l_2SV_cXlRIhs0Ug=/1200x628/smart/arc-anglerfish-arc2-prod-bonnier.s3.amazonaws.com/public/NMSL74OQBBHGFJ6PXRXMEHELGI.jpg", new String[]{"Sikorsky S-70", "Eurocopter EC135", "Eurocopter EC145", "Sikorsky S-76"}));
        addQuestion(new Question("Sikorsky S-70", "https://resources.flightsafety.com/wp-content/uploads/sites/2/2017/11/Sikorsky-S70-helicopter-training-1.jpg", new String[]{"Sikorsky S-76", "Eurocopter EC135", "Eurocopter AS350", "Sikorsky S-70"}));
        addQuestion(new Question("Bell 412", "https://www.bellflight.com/-/media/site-specific/bell-flight/images/2-products/bell-412/images/412ep_v001_wstd.jpg", new String[]{"Bell 407", "Eurocopter EC135", "Bell 212", "Bell 412"}));
        addQuestion(new Question("Bell 212", "https://media.sandhills.com/img.axd?id=2001341428&wid=4326165471&rwl=False&p=&ext=&w=639&h=480&t=&lp=CNT&c=True&wt=False&sz=Max&rt=0&checksum=eT1zTgbRoZTWxC9%2FongB4sJ4UyNAR2DG4P7dWuIml1w%3D", new String[]{"Bell 407", "Eurocopter EC135", "Bell 212", "Bell 412"}));
        addQuestion(new Question("Eurocopter Fennec", "https://alchetron.com/cdn/eurocopter-fennec-4ab7a66d-0fbb-4b85-8306-84e978e18e5-resize-750.jpeg", new String[]{"Eurocopter AS350", "Eurocopter EC135", "Eurocopter EC145", "Eurocopter Fennec"}));
        addQuestion(new Question("Robinson R22", "https://upload.wikimedia.org/wikipedia/commons/0/01/Robinson_R22_Beta_Heli_Travaux%2C_BBJ_Bitburg_%28Bitburg_Air_Base%29%2C_Germany_PP1278146759.jpg", new String[]{"Robinson R22", "Eurocopter EC135", "Eurocopter EC145", "Sikorsky S-76"}));
        addQuestion(new Question("AgustaWestland AW109", "https://upload.wikimedia.org/wikipedia/commons/4/4e/RAF_A109.jpg", new String[]{"AgustaWestland AW109", "Eurocopter EC135", "Sikorsky S-70", "Sikorsky S-76"}));
        addQuestion(new Question("Eurocopter EC135", "https://www.corporatehelicopters.com/wp-content/uploads/2017-eurocopter-ec135-t2.jpg", new String[]{"Eurocopter AS350", "Eurocopter EC135", "Eurocopter EC145", "Eurocopter Fennec"}));



    }
}
