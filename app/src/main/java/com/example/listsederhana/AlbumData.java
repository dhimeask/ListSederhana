package com.example.listsederhana;

import java.util.ArrayList;

public class AlbumData {
    private static String[] albumNames = {
            "When Dream and Day Unite",
            "Images and Words",
            "Awake",
            "Falling into Infinity",
            "Metropolis Pt.2: Scenes From Memories",
            "Six Degrees of Inner Turbulence",
            "Train of Thought",
            "Octavarium",
            "Systematic Chaos",
            "Black Clouds and Silver Linings",
            "A Dramatic Turn of Events",
            "The Astonishing",
            "Dream Theater",
            "Distance Over Time"
    };
    private static String[] albumDetails = {
            "When Dream and Day Unite is the debut studio album by American progressive metal band Dream Theater, released on March 6, 1989 through Mechanic/MCA Records.[1] The album is composed mainly of material that originally surfaced during the band's early years as Majesty, and it is the only Dream Theater album to be recorded with their full original lineup that features Charlie Dominici on vocals, as James LaBrie replaced Dominici as the lead vocalist on all subsequent albums.",
            "Images and Words is the second studio album by American progressive metal band Dream Theater, released on July 7, 1992 through ATCO Records.[1] It is the first Dream Theater release to feature James LaBrie on vocals. Since its release, the album has maintained its position as the band's most commercially successful studio album, and the song \"Pull Me Under\" has the distinction of being the only Top 10 hit (radio or otherwise) the band has had to date. This particular song has also had more recent success as it has appeared in the 2008 video game Guitar Hero World Tour.[3] ",
            "Awake is the third studio album by American progressive metal band Dream Theater, released on October 4, 1994 through East West Records. It was the last Dream Theater album to feature keyboardist Kevin Moore, who announced his decision to leave the band during the recording of the album. ",
            "Falling into Infinity is the fourth studio album by American progressive metal band Dream Theater, released on September 23, 1997 through EastWest Records. It is the band's only studio album to feature keyboardist Derek Sherinian, following the departure of Kevin Moore in 1994.Falling into Infinity was produced by Kevin Shirley. The album's writing and pre-production phases were stressful periods for the band, as they were feeling constant pressure from the record label to deliver a more radio-friendly album. It was recorded in June 1997 at Avatar Studios (previously known as Power Station Studios) in Manhattan, New York. ",
            "Metropolis Pt. 2: Scenes from a Memory is the fifth studio album and first concept album by American progressive metal band Dream Theater, released on October 26, 1999 through Elektra Records. It was recorded at BearTracks Studios in Suffern, New York, where the band had previously recorded their second studio album Images and Words (1992) and the EP A Change of Seasons (1995).The album is the sequel to \"Metropolis—Part I: 'The Miracle and the Sleeper'\", a song previously featured on the band's 1992 album Images and Words. It was also the first album to feature Jordan Rudess on keyboards, and the last album not to end with its longest track until A Dramatic Turn of Events (2011). ",
            "Six Degrees of Inner Turbulence is the sixth full-length studio album by progressive metal band Dream Theater, released as a double-disc album on January 29, 2002 through Elektra Records. Excluding the A Change of Seasons EP, it is the first Dream Theater album to feature a title track. It is also their second longest studio album to date, after The Astonishing. All songs from it have been played live to date. ",
            "Train of Thought is the seventh studio album by American progressive metal band Dream Theater, released on November 11, 2003 through Elektra Records.Inspired by the audience response to Dream Theater's heavier songs while on tour,[4] in the Chaos in Progress documentary, Portnoy says that they wanted Train of Thought to be a \"balls to the wall\" album with heavier, darker riffing, exposing them to a number of new metal fans. The album was written in three weeks.[5] It was engineered by Doug Oberkircher and mixed by Kevin Shirley.[6] Most of the album was played in concert for the Live at Budokan DVD. All songs from it have been played live to date. ",
            "Octavarium is the eighth studio album by American progressive metal band Dream Theater. Released on June 7, 2005, it was the band's final release with Atlantic Records. Recorded between September 2004 and February 2005, it was the last album recorded at The Hit Factory in New York City. With it, the band decided to create \"a classic Dream Theater album\",[2] drawing upon their various stylistic influences while trying to make the music less complex. The album takes its creative concept from the musical octave.Octavarium peaked in the top five in the Finnish,[3] Italian,[4] and Swedish charts,[5] and in the top ten in the Dutch,[6] Japanese,[7] and Norwegian charts.[8] Critical reception of the album was generally positive; the diversity of the music was praised, although critics found some of the songwriting to be inconsistent. Dream Theater promoted the album on a year-long world tour, with the majority of concerts lasting almost three hours and featuring a different setlist each night. The tour finished at Radio City Music Hall accompanied by an orchestra; this performance was recorded and released as a live album and concert video entitled Score. They co-headlined the 2005 North American Gigantour with Megadeth. ",
            "Systematic Chaos is the ninth studio album by American progressive metal band Dream Theater. Released on June 4, 2007 in the United Kingdom and June 5, 2007 in the United States, Systematic Chaos was the band's first release through Roadrunner Records, which was sold to their previous label Atlantic Records, through which the band had released their previous studio album Octavarium (2005). The album was recorded from September 2006 to February 2007 at Avatar Studios in New York City, after the band's first break from summer touring in ten years. The lyrics of the album were written by John Petrucci, James LaBrie, and Mike Portnoy about fictional, political, and personal topics, respectively.[1] ",
            "Black Clouds & Silver Linings is the tenth studio album by American progressive metal band Dream Theater, released on June 23, 2009 through Roadrunner Records.[2][3] It is the band's last album to feature drummer and founding member Mike Portnoy before his departure on September 8, 2010.[4] The album was recorded between October 2008 and March 2009 at Avatar Studios in New York City, where they previously recorded Falling Into Infinity (1997) and Systematic Chaos (2007). Black Clouds & Silver Linings was produced by John Petrucci and Portnoy, and was engineered and mixed by Paul Northfield. ",
            "A Dramatic Turn of Events is the eleventh studio album by American progressive metal band Dream Theater, released worldwide in September 2011 through Roadrunner Records. It is the band's first recording to feature drummer Mike Mangini, following the departure of founding member Mike Portnoy in September 2010. The album was written, recorded, mixed, and mastered between January and June 2011 at Cove City Sound Studios in Long Island, New York. It was produced by guitarist John Petrucci and mixed by Andy Wallace. Two singles, \"On the Backs of Angels\" and \"Build Me Up, Break Me Down\", were released in promotion of the album. ",
            "Dream Theater is the self-titled twelfth studio album by American progressive metal band Dream Theater, released through Roadrunner Records on September 23, 2013 in Europe and a day later in North America. The album was written, recorded, mixed, and mastered between January and May 2013 at Cove City Sound Studios in Long Island, New York, the same studio as the band's previous album, A Dramatic Turn of Events (2011). It is the first Dream Theater album to include drummer Mike Mangini in the songwriting process. ",
            "The Astonishing is the thirteenth studio album by American progressive metal band Dream Theater, released on January 29, 2016 through Roadrunner Records. It is the band's second concept album, with a story conceived by guitarist John Petrucci and music written by Petrucci and keyboardist Jordan Rudess. Composer David Campbell assisted with orchestrating the album's strings and choirs. The band recorded their parts for the album throughout 2015 at Cove City Sound Studios in Long Island, New York, with the exception of vocals, which were recorded in Canada. Mixing and sound engineering were performed by the band's longtime collaborator, Richard Chycki, with Petrucci producing. ",
            "Distance over Time is the fourteenth studio album by American progressive metal band Dream Theater, released on February 22, 2019 through Inside Out Music.[1][2] Distance over Time was announced alongside a tour of North America where Dream Theater will support the new album and celebrate the 20th anniversary of its fifth studio album, Metropolis Pt. 2: Scenes from a Memory (1999).[3][4][5] On December 7, 2018, the lead single \"Untethered Angel\" and its music video were released.[6] The second single, \"Fall into the Light\", was released on January 11, 2019.[7] The third single, \"Paralyzed\", and its accompanying video were released on February 8, 2019.[8] It is the band's most successful album chart-wise to date, taking top 10 positions in 19 countries (including going to number one in Germany and Switzerland). "
    };
    private static int[] albumImages = {
            R.drawable.whendreamanddayunite,
            R.drawable.imagesand,
            R.drawable.awake,
            R.drawable.fallingintoinfinity,
            R.drawable.metropolispt2scenes,
            R.drawable.sixdegreesofinnerturbulence,
            R.drawable.metropolispt2scenes,
            R.drawable.octavarium,
            R.drawable.blackcloudsandsilverlining,
            R.drawable.adramaticturnofevents,
            R.drawable.dreamtheater,
            R.drawable.theastonishing,
            R.drawable.distance
    };
    static ArrayList<Album> getListData() {
        ArrayList<Album> list = new ArrayList<>();
        for (int position = 0; position < albumNames.length; position++) {
            Album album = new Album();
            album.setName(albumNames[position]);
            album.setDetail(albumDetails[position]);
            album.setPhoto(albumImages[position]);
            list.add(album);
        }
        return list;
    }
}
