package com.example.myquizapp

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Jak mam na Imię?",
            R.drawable.first,
            "Borys", "Artur",
            "Paweł", "Jakub",
            4
        )
        questionsList.add(que1)

        //que2

        val que2 = Question(
            2, "Ile w bicu na ten moment?",
            R.drawable.sec,
            "10cm", "21cm",
            "37cm", "40cm",
            3
        )
        questionsList.add(que2)

        //que3

        val que3 = Question(
            3, "Gdzie się urodziłem?",
            R.drawable.three,
            "W Sanoku", "W Zagórzu",
            "W Brzozowie", "W stajence",
            1
        )
        questionsList.add(que3)

        //que 4
        val que4 = Question(
            4, "Co lubię pić?",
            R.drawable.four,
            "Wodę", "Wódę",
            "Kwas solny", "Jagerka",
            4
        )
        questionsList.add(que4)
        //que 5
        val que5 = Question(
            5, "Ile mam wzrostu?",
            R.drawable.five,
            "No tak z metr pięćdzieściąt", "1,83m",
            "Wysoki chłop jest", "1,50m",
            2
        )
        questionsList.add(que5)
        //que 6
        val que6 = Question(
            6, "Kiedy mam urodziny?",
            R.drawable.six,
            "Dawno temu", "05.05.2002",
            "01.06.2002", "28.02.2002",
            3
        )
        questionsList.add(que6)
        //que 7
        val que7 = Question(
            7, "Jaki sport lubię?",
            R.drawable.sev,
            "Koszykówka", "Picie na czas",
            "Babington", "Piłka nożna kobiet",
            1
        )
        questionsList.add(que7)
        //que 8
        val que8 = Question(
            8, "Fajny ze mnie gość?",
            R.drawable.eigh,
            "Nie", "Tak",
            "Czasem", "Jesteś soboł",
            2
        )
        questionsList.add(que8)

        return questionsList
    }
}