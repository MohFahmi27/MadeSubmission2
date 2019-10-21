package com.example.moviecatalogue2;

import java.util.ArrayList;

public class TvshowData {
    public static String[][] TvshowData = new String[][] {
            {
                    "Dark (2017 -)",
                    "Crime, Drama, Mystery",
                    "A family saga with a supernatural twist, set in a German town, where the disappearance of two young children exposes the relationships among four families.",
                    "https://image.tmdb.org/t/p/original/ajmkAwuK1TRFWMjKoSMgoAXbnc7.jpg",
                    "19 Episodes",
                    "8.7",
                    "Baran bo Odar, Jantje Friese"
            },
            {
                    "Chernobyl (2019)",
                    "Drama, History, Thriller",
                    "A dramatization of the true story of one of the worst man-made catastrophes in history, the catastrophic nuclear accident at Chernobyl. A tale of the brave men and women who sacrificed to save Europe from unimaginable disaster.",
                    "https://image.tmdb.org/t/p/original/hlLXt2tOPT6RRnjiUmoxyG1LTFi.jpg",
                    "5 Episodes",
                    "9.5",
                    "Craig Mazin"
            },
            {
                    "Planet Earth II (2016)",
                    "Drama, History, Thriller",
                    "David Attenborough presents a documentary series exploring how animals meet the challenges of surviving in the most iconic habitats on earth.",
                    "https://image.tmdb.org/t/p/original/uy5QoTu8fc6fGXMCTMbpQJFUEB0.jpg",
                    "6 Episodes",
                    "9.5",
                    "Alastair Fothergill"
            },
            {
                    "Stranger Things (2016 -)",
                    "Drama, Fantasy, Horror",
                    "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back. ",
                    "https://image.tmdb.org/t/p/original/x2LSRK2Cm7MZhjluni1msVJ3wDF.jpg",
                    "6 Episodes",
                    "8.9",
                    "Matt Duffer, Ross Duffer"
            },
            {
                    "Family Guy  (1999 -)",
                    "Animation, Comedy",
                    "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                    "https://image.tmdb.org/t/p/original/n3UBzIx28m3FpC2EDwVJIjvPxnl.jpg",
                    "336 Episodes",
                    "8.2",
                    "Seth MacFarlane, David Zuckerman"
            },
            {
                    "Rick and Morty (2013 -)",
                    "Animation, Adventure, Comedy",
                    "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
                    "https://image.tmdb.org/t/p/original/qJdfO3ahgAMf2rcmhoqngjBBZW1.jpg",
                    "41 Episodes",
                    "9.3",
                    "Dan Harmon, Justin Roiland"
            },
            {
                    "Band of Brothers (2001)",
                    "Action, Drama, History",
                    "Drawn from interviews with survivors of Easy Company, as well as their journals and letters, Band of Brothers chronicles the experiences of these men from paratrooper training in Georgia through the end of the war. As an elite rifle company parachuting into Normandy early on D-Day morning, participants in the Battle of the Bulge, and witness to the horrors of war, the men of Easy knew extraordinary bravery and extraordinary fear - and became the stuff of legend. Based on Stephen E. Ambrose's acclaimed book of the same name.",
                    "https://image.tmdb.org/t/p/original/bUrt6oeXd04ImEwQjO9oLjRguaA.jpg",
                    "10 Episodes",
                    "9.5",
                    "David Frankel, Tony To, Tom Hanks"
            },
            {
                    "Breaking Bad  (2008-2013)",
                    "Crime, Drama, Thriller",
                    "When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime.",
                    "https://image.tmdb.org/t/p/original/knmKpwrnCEWkt3aCL4fvqr403EY.jpg",
                    "62 Episodes",
                    "9.5",
                    "Vince Gilligan"
            },
            {
                    "The Office (2005-2013)",
                    "Comedy",
                    "The everyday lives of office employees in the Scranton, Pennsylvania branch of the fictional Dunder Mifflin Paper Company.",
                    "https://image.tmdb.org/t/p/original/biU7kCVB5dQT5zTlSyqwg8cxzyL.jpg",
                    "188 Episodes",
                    "8.8",
                    "Greg Daniels, Ricky Gervais, Stephen Merchant"
            },
            {
                    "Narcos (2015-2017)",
                    "Biography, Crime, Drama",
                    "A chronicled look at the criminal exploits of Colombian drug lord Pablo Escobar, as well as the many other drug kingpins who plagued the country through the years.",
                    "https://image.tmdb.org/t/p/original/rTmal9fDbwh5F0waol2hq35U4ah.jpg",
                    "30 Episodes",
                    "8.8",
                    "Carlo Bernard, Chris Brancato, Doug Miro"
            }
    };
    public static ArrayList<Tvshow> getListDataTvshow() {
        ArrayList<Tvshow> list = new ArrayList<>();
        for (String[] Data : TvshowData) {
            Tvshow tvshow = new Tvshow();
            tvshow.setTvTittle(Data[0]);
            tvshow.setTvGenre(Data[1]);
            tvshow.setTvSynopsis(Data[2]);
            tvshow.setTvPoster(Data[3]);
            tvshow.setTvEpisode(Data[4]);
            tvshow.setTvRating(Data[5]);
            tvshow.setTvDirector(Data[6]);

            list.add(tvshow);
        }
        return list;
    }
}
