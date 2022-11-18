# As we finished our project, and was supposed to merge our products together, problems accured. 
Thats why we would like you to look at this branch + OrhanDone1 as we couldn't manage to merge them together.
Some of our functioning code is in this branch, while some of them is in OrhanDone1. 
Sorry....


Update:
OrhansDone1 is not working either.. Complete mess, the code that isnt working in the program are these (but they've been tested at some point where they actually worked, but for odd reasons they stopped after merging and commiting

 case "1":

                    for (Movie m : movies) {
                        System.out.println(m.toString());
                    }

                    System.out.println("Ønsker du at se en af de film? Ja / Nej?");
                    switch (choice.nextLine()) {
                        case "Ja":
                            System.out.println("Hvilken film vil du se?");
                            String chosenMovie = choice.nextLine();
                            boolean found = false;
                            for (Movie m : movies) {
                                if (m.getName().equalsIgnoreCase(chosenMovie)) {
                                    found = true;
                                }
                            }
                            if (found) {
                                System.out.println("Du har valgt at se: " + chosenMovie);
                                System.out.println("Filmen afspilles nu");
                                if (!watchedMovieList.contains(chosenMovie)) {
                                    watchedMovieList.add(chosenMovie);
                                    userWriter.write(chosenMovie + "\n ");
                                    userWriter.close();
                                }
                            }
                            if (!found) {
                                System.out.println("Filmen findes ikke.");
                            }
                            
Case 1 = Checks if the "chosenmovie" from user is in our movie - if it is, code continues and adds to our arraylist and our document

 case "3":
                            File savedMovieFile = new File("C:\\Users\\Public\\SP3-TuransBranch-displayMethod\\Data\\SavedMovieList.txt");
                            //FileInputStream - allows us to read bytes from a file - one byte at a time
                            FileInputStream readFile = new FileInputStream(savedMovieFile);

                            int oneByte;
                            //We can write to System.out 'onebyte' at a time using its write() method.
                            //FileInputStream returns -1 when it reaches the end of the file.
                            while ((oneByte = readFile.read()) != -1) {
                                System.out.print((char) oneByte);
                            }
                            System.out.flush();
                            break;
                            
Case 3 = Makes it possible for the user to grant access to his "SavedMovies.txt"

case "4":

                            File watchedMoviesFile = new File("C:\\Users\\Public\\SP3-TuransBranch-displayMethod\\Data\\WatchedMovies.txt");
                            //FileInputStream - allows us to read bytes from a file - one byte at a time
                            FileInputStream readFile1 = new FileInputStream(watchedMoviesFile);

                            int oneByte1;
                            //We can write to System.out 'onebyte' at a time using its write() method.
                            //FileInputStream returns -1 when it reaches the end of the file.
                            while ((oneByte1 = readFile1.read()) != -1) {
                                System.out.print((char) oneByte1);
                            }
                            System.out.flush();
                            break;
Case 4 = Makes it possible for the user to grant access to his "WatchedMovies.txt"

Case "6":

 try {
            System.out.println("Indtast venligst den film du ønsker at gemme");
            //gemmer users input som 'saveMovie'
            String saveMovie = scan.nextLine();
            //erstatter det gamle navn af filmen til vores nye input som brugeren angiver
            movie.setMovieName(saveMovie);

            //tilføjer vores movie til vores arraylist og printer det ud
            savedMovieList.add(movie);

            //Fortæller hvad der skal skrives til vores fil
            userWriter.write(movie.getMovieName() + "\n");

            //Gemmer det i filen
            userWriter.close();
            System.out.println("Du har valgt at gemme filmen " + movie.getMovieName());
        } catch (Exception e) {
            e.printStackTrace();

        }

        return movie;
    }public static Movie MovieSavedList() throws IOException {

        Scanner scan = new Scanner(System.in);
        ArrayList<Movie> savedMovieList = new ArrayList<>();
        Movie movie = new Movie("Godfather", "1972", "Crime; Drama", "9.2");
        BufferedWriter userWriter = new BufferedWriter(new FileWriter("C:\\Users\\unito\\OneDrive\\Dokumenter\\GitHub\\SP3NEW\\Src\\SavedMovieList", true));


        try {
            System.out.println("Indtast venligst den film du ønsker at gemme");
            //gemmer users input som 'saveMovie'
            String saveMovie = scan.nextLine();
            //erstatter det gamle navn af filmen til vores nye input som brugeren angiver
            movie.setMovieName(saveMovie);

            //tilføjer vores movie til vores arraylist og printer det ud
            savedMovieList.add(movie);

            //Fortæller hvad der skal skrives til vores fil
            userWriter.write(movie.getMovieName() + "\n");

            //Gemmer det i filen
            userWriter.close();
            System.out.println("Du har valgt at gemme filmen " + movie.getMovieName());
        } catch (Exception e) {
            e.printStackTrace();

        }

        return movie;
    }
Case 6 - Makes it possible for the user to save movies in his "SavedMovieList.txt"
