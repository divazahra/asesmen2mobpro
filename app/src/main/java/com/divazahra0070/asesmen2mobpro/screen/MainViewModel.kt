package com.divazahra0070.asesmen2mobpro.screen

import androidx.lifecycle.ViewModel
import com.divazahra0070.asesmen2mobpro.model.Film

class MainViewModel : ViewModel() {
    val data = listOf(
        Film(
            1,
            "Top Gun: Maverick",
            "Seorang pilot legendaris kembali melatih generasi baru pilot tempur" +
                    "Ia harus menghadapi masa lalu dan tantangan berbahaya di udara.",
            "Action",
            "27 Mei 2022"
        ),
        Film(
            2,
            "Extraction",
            "Seorang tentara bayaran ditugaskan menyelamatkan anak seorang penguasa kriminal. " +
                    "Misinya berubah jadi perjuangan bertahan hidup di kota musuh.",
            "Action",
            "24 April 2020"
        ),
        Film(
            3,
            "The Raid",
            "Tim polisi menyerbu gedung penuh kriminal berbahaya. " +
                    "Operasi berubah menjadi pertarungan brutal dari lantai ke lantai.",
            "Action",
            "23 Maret 2012"
        ),

        Film(
            4,
            "The Lost City",
            "Penulis novel diculik karena tulisannya dianggap petunjuk harta karun. " +
                    "Petualangan kocak dimulai bersama pria tak terduga di pulau berbahaya.",
            "Comedy",
            "25 Maret 2022"
        ),
        Film(
            5,
            "Free Guy",
            "Karakter video game menyadari dirinya hidup dalam simulasi. " +
                    "Ia menjadi pahlawan dan mengubah jalan hidupnya sendiri.",
            "Comedy",
            "13 Agustus 2021"
        ),
        Film(
            6,
            "Game Night",
            "Permainan biasa berubah jadi malam penuh konspirasi dan kekacauan. " +
                    "Sekelompok teman harus memecahkan misteri yang ternyata nyata.",
            "Comedy",
            "23 Februari 2018"
        ),

        Film(
            7,
            "The Lord of the Rings: The Fellowship of the Ring",
            "Sekelompok pahlawan memulai perjalanan menghancurkan cincin jahat. " +
                    "Mereka harus melewati rintangan berbahaya demi menyelamatkan dunia.",
            "Fantasy",
            "19 Desember 2001"
        ),
        Film(
            8,
            "Pan’s Labyrinth",
            "Gadis muda masuk dunia bawah tanah penuh makhluk aneh di tengah perang. " +
                    "Ia menjalani tiga tugas demi membuktikan jati dirinya.",
            "Fantasy",
            "11 Oktober 2006"
        ),
        Film(
            9,
            "Alice in Wonderland",
            "Gadis muda kembali ke dunia aneh yang penuh makhluk ajaib. " +
                    "Ia menghadapi Ratu Merah dan menemukan keberaniannya sendiri.",
            "Fantasy",
            "5 Maret 2010"
        ),

        Film(
            10,
            "La La Land",
            "Musisi dan aktris jatuh cinta sambil mengejar mimpi di Los Angeles. C" +
                    "inta mereka diuji oleh ambisi dan kenyataan hidup.",
            "Romance",
            "9 Desember 2016"
        ),
        Film(
            11,
            "Pride and Prejudice",
            "Wanita cerdas bertemu pria kaya yang tampak sombong. " +
                    "Prasangka dan kejujuran perlahan menumbuhkan cinta sejati.",
            "Romance",
            "11 November 2005"
        ),
        Film(
            12,
            "500 Days of Summer",
            "Pria mengenang kisah cinta yang penuh harapan dan kekecewaan. " +
                    "Ia belajar menerima kenyataan dan menemukan makna baru tentang cinta.",
            "Romance",
            "17 Juli 2009"
        ),

        Film(
            13,
            "Hereditary",
            "Keluarga ini dihantui setelah kematian nenek mereka. " +
                    "Rahasia kelam berubah menjadi kutukan yang menyeramkan.",
            "Horror",
            "8 Juni 2018"
        ),
        Film(
            14,
            "A Quiet Place",
            "Makhluk berburu berdasarkan suara membuat satu keluarga hidup dalam keheningan. " +
                    "Setiap bunyi bisa berujung pada kematian.",
            "Horror",
            "6 April 2018"
        ),
        Film(
            15,
            "Get Out",
            "Seorang pria mengunjungi keluarga kekasihnya dan menemukan keanehan. " +
                    "Ia terjebak dalam situasi menyeramkan yang mengancam jiwanya.",
            "Horror",
            "24 Februari 2017"
        )
    )
}