package perpustakaan;

public class libary {
        public String[][] Filsafat = {
                        { "Meditations", "Marcus Aurelius", "121-180 AD" },
                        { "Sophie's World", "Jostein Gaarder", "1991" },
                        { "Thus Spoke Zarathustra", "Friedrich Nietzsche", "1883" },
                        { "The Republic", "Plato", "c. 380 BC" },
                        { "Being and Time", "Martin Heidegger", "1927" }

        };

        public String[][] Teknologi = {
                        { "The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution",
                                        "Walter Isaacson", "2014" },
                        { "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "2011" },
                        { "Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", "2015" },
                        { "The Shallows: What the Internet Is Doing to Our Brains", "Nicholas Carr ", "2010" },
                        { "The Age of Surveillance Capitalism: The Fight for a Human Future at the New Frontier of Power",
                                        "Shoshana Zuboff", "2019" }
        };

        public String[][] Agama = {
                        { "The Bible", "(Alkitab)", "Berbagai kitab, berbagai waktu penulisan" },
                        { "The Quran", "(Al-quran)", "mulai 610 M" },
                        { "The Tao Te Ching", "Lao Tzu", "Diperkirakan abad ke-6 atau ke-4 SM" },
                        { "The Bhagavad Gita", "(kitab hindu)", "(Diperkirakan abad ke-5 SM)" },
                        { "The Tibetan Book of Living and Dying", "Sogyal Rinpoche", "1992" }
        };

        public String[][] Sejarah = {
                        { "Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", "1997" },
                        { "A People's History of the United States", "Howard Zinn", "1980" },
                        { "The Silk Roads: A New History of the World", "Peter Frankopan", "2015" },
                        { "1491: New Revelations of the Americas Before Columbus", "Charles C. Mann", "2005" },
                        { "SPQR: A History of Ancient Rome", "Mary Beard", "2015" }
        };

        public String[][] Psikologi = {

                        { "Thinking, Fast and Slow", "Daniel Kahneman", "2011" },
                        { "The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "2012" },
                        { "Man's Search for Meaning", "Viktor E. Frankl", "1946" },
                        { "Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "2012" },
                        { "Flow: The Psychology of Optimal Experience", "Mihaly Csikszentmihalyi", "1990" }
        };

        public String[][] Politik = {
                        { "The Prince", "Niccolò Machiavelli", "1532" },
                        { "The Communist Manifesto", "Karl Marx dan Friedrich Engels", "1848" },
                        { "Democracy in America", "Alexis de Tocqueville", "1835" },
                        { "The End of History and the Last Man", "Francis Fukuyama", "1992" },
                        { "The Origins of Totalitarianism", "Hannah Arendt", "1951" }
        };

        public String[][] Fiksi = {
                        { "1984", "George Orwell", "1949" },
                        { "Brave New World", "Aldous Huxley", "1949" },
                        { "The Handmaid's Tale", "Margaret Atwood", "1985" },
                        { "The Lord of the Rings", "J.R.R Tolkien", "1954" },
                        { "To Kill a Mockingbird", "Harper Lee", "1960" }
        };

        public String getInformasiBuku(int kode) {
                String informasi = "";

                if (kode == 1) {
                        informasi = "Kategori: Filsafat\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Filsafat) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "tahun pembuatan\t: " + buku[2] + "\n\n";
                        }
                } else if (kode == 2) {
                        informasi = "Kategori: Teknologi\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Teknologi) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                informasi += "Tahun Pembuatant: " + buku[2] + "\n\n";
                        }
                } else if (kode == 3) {
                        informasi = "Kategori: Agama\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Agama) {
                                informasi += "Judul\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                if (buku.length > 2) {
                                        informasi += "Tahun pembuatan\t: " + buku[2] + "\n";
                                }
                                informasi += "\n";
                        }
                } else if (kode == 4) {
                        informasi = "Kategori: Sejarah\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Sejarah) {
                                informasi += "Judul\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                if (buku.length > 2) {
                                        informasi += "Tahun pembuatan\t: " + buku[2] + "\n";
                                }
                                informasi += "\n";
                        }
                } else if (kode == 5) {
                        informasi = "Kategori: Psikologi\n";
                        informasi += "\n";
                        for (String[] buku : Psikologi) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                if (buku.length > 2) {
                                        informasi += "Tahun Pembuatan\t: " + buku[2] + "\n\n";
                                }
                                informasi += "\n";

                        }
                } else if (kode == 6) {
                        informasi = "Kategori: Politik\n";
                        informasi += "----------------------\n";
                        for (String[] buku : Politik) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                if (buku.length > 2) {
                                        informasi += "Tahun Pembuatan\t: " + buku[2] + "\n\n";
                                }
                                informasi += "\n";
                        }
                } else if (kode == 7) {
                        informasi = "Kategori: Fiksi\n";
                        informasi += "========================\n";
                        for (String[] buku : Fiksi) {
                                informasi += "Judul\t\t: " + buku[0] + "\n";
                                informasi += "Pengarang\t: " + buku[1] + "\n";
                                if (buku.length > 2) {
                                        informasi += "Tahun Pembuatan\t: " + buku[2] + "\n\n";
                                }
                                informasi += "\n";
                        }
                } else {
                        informasi = "Kode buku tidak valid.";
                }
                return informasi;
        }
}
