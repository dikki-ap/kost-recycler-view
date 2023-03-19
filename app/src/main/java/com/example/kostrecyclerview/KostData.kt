package com.example.kostrecyclerview

object KostData {
    private val kostName = arrayOf(
        "Sakinah Kost",
        "Cosmo Elite Kost",
        "Kost Pamoyanan XV",
        "Kost Harian Surabaya",
        "Executive Residence",
        "OYO Papikoel",
        "Dieng Inn",
        "Malioboro Guest House",
        "Bali Kost Utama",
        "Kualanamu Hotel",
    )

    private val kostPlace = arrayOf(
        "Petisah, Medan",
        "Cilandak, Jakarta Selatan",
        "Cicendo, Bandung",
        "Sawahan, Surabaya",
        "Sleman, Yogyakarta",
        "Medan Selayang, Medan",
        "Wonosobo, Jawa Tengah",
        "Sleman, Yogyakarta",
        "Denpasar, Bali",
        "Batang Kuis, Medan",
    )

    private val kostPrice = arrayOf(
        "Rp. 2500 K / month",
        "Rp. 900 K / month",
        "Rp. 1200 K / month",
        "Rp. 850 K / month",
        "Rp. 1350 K / month",
        "Rp. 1650 K / month",
        "Rp. 600 K / month",
        "Rp. 2700 K / month",
        "Rp. 1700 K / month",
        "Rp. 950 K / month",
    )

    private val kostPhoto = arrayOf(
        R.drawable.kost_1,
        R.drawable.kost_2,
        R.drawable.kost_3,
        R.drawable.kost_4,
        R.drawable.kost_5,
        R.drawable.kost_6,
        R.drawable.kost_7,
        R.drawable.kost_8,
        R.drawable.kost_9,
        R.drawable.kost_10,
    )

    private val kostDescription = arrayOf(
        "Fasilitas sangat lengkap, tersedia AC, lemari, meja, hingga dapur mini. Tersedia Water Heater " +
                "agar dapat menggunakan air hangat hingga panas. Lokasi sangat strategis dekat dengan fasilitas publik.",
        "Tersedia AC, dan lemari. Tidak tersedia Water Heater. Lokasi sangat strategis tepat di pusat kota" +
                "dekat dengan semua fasilitas publik.",
        "Menyediakan AC, lemari, dan Water Heater. Lokasi sedikit jauh dari pusat kota " +
                " tetapi dekat dengan fasilitas publik. Tersedia dapur umum bagi yang membutuhkan.",
        "Tidak tersedia AC, hanya tersedia lemari dan meja kecil. Lokasi berada di pusat kota " +
                "dekat dengan semua fasilitas publik. Jarak tempuh ke bandara hanya 15 menit saja.",
        "Fasilitas sangat lengkap, tersedia AC, lemari, meja, hingga Water Heater. Tersedia juga dapur umum bagi yang membutuhkan " +
                "lokasi sangat strategis di pusat kota dan dekat dengan fasilitas publik.",
        "Fasilitas sangat lengkap, tersedia AC, lemari, meja, hingga dapur mini. Tersedia Water Heater " +
                "agar dapat menggunakan air hangat hingga panas. Lokasi sangat strategis dekat dengan fasilitas publik.",
        "Tersedia AC, dan lemari. Tidak tersedia Water Heater. Lokasi sangat strategis tepat di pusat kota" +
                "dekat dengan semua fasilitas publik.",
        "Menyediakan AC, lemari, dan Water Heater. Lokasi sedikit jauh dari pusat kota " +
                " tetapi dekat dengan fasilitas publik. Tersedia dapur umum bagi yang membutuhkan.",
        "Tidak tersedia AC, hanya tersedia lemari dan meja kecil. Lokasi berada di pusat kota " +
                "dekat dengan semua fasilitas publik. Jarak tempuh ke bandara hanya 15 menit saja.",
        "Fasilitas sangat lengkap, tersedia AC, lemari, meja, hingga Water Heater. Tersedia juga dapur umum bagi yang membutuhkan " +
                "lokasi sangat strategis di pusat kota dan dekat dengan fasilitas publik."
    )

    val listData: ArrayList<Kost>
        get() {
            val list = arrayListOf<Kost>()

            for (position in kostName.indices) {
                var kost = Kost()

                kost.name = kostName[position]
                kost.place = kostPlace[position]
                kost.price = kostPrice[position]
                kost.description = kostDescription[position]
                kost.photo = kostPhoto[position]

                list.add(kost)
            }

            return list
        }
}