package com.ujiantengahsemester.recyclerview;

import java.util.ArrayList;

public class hewanData {
    private static String [] namaHewan = {
            "Gajah",
            "Jerapah",
            "Kijang",
            "Rusa",
            "Sapi",
            "Burung",
            "Singa",
            "Macan Tutul",
            "Kucing",
            "Anjing"
    };

    private static String [] detailHewan = {
            "Gajah adalah hewan mamalia yang mempunyai ukuran yang besar. Gajah memiliki ciri-ciri seperti, belalai yang panjang,telinga yang besar dan melebar,mempunyai gading, warna kulitnya abu-abu sampai hitam.",
            "Jerapah adalah hewan memamah biak yang memiliki ciri khas leher yang panjang dan kulit yang bercorak totol. Jerapah adalah salah satu mamalia tertinggi dengan tinggi hingga 6 meter.",
            "Kijang atau muncak adalah kerabat rusa yang tergabung dalam genus Muntiacus. Kijang berasal dari Dunia Lama dan dianggap sebagai jenis rusa tertua, telah ada sejak 15-35 juta tahun yang lalu, dengan sisa-sisa dari masa Miosen ditemukan di Prancis dan Jerman.",
            "Rusa adalah hewan mamalia yang termasuk famili Cervidae. Salah satu ciri khas rusa adalah adanya antler, dan bukan tanduk, yang merupakan pertumbuhan tulang yang berkembang setiap tahun terutama pada rusa jantan.",
            "Sapi adalah hewan ternak anggota suku Bovidae dan anak suku Bovinae. Sapi yang telah dikebiri dan biasanya digunakan untuk membajak sawah dinamakan lembu.",
            "Burung adalah anggota kelompok hewan bertulang belakang (vertebrata) yang memiliki bulu dan sayap. Fosil tertua burung ditemukan di Jerman dan dikenal sebagai Archaeopteryx.",
            "Singa adalah hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya.",
            "Macan tutul adalah salah satu dari empat kucing besar. Macan tutul dewasa dapat tumbuh dengan panjang tubuh antara satu hingga dua meter. Spesies ini umumnya memiliki bulu kuning kecoklatan dengan bintik-bintik hitam.",
            "Kucing adalah hewan yang memiliki anatomi tubuh yang kuat, fleksibel  dan reflek yang cepat. Kucing juga memiliki taring dan cakar yang tajam untuk menangkap mangsanya. Kucing masuk ke dalam kategori predator nokturnal ( yang aktif di malam hari dan tidur di siang hari), yang memiliki penciuman dan pendengaran yang lebih tajam dari manusia.",
            "Anjing adalah hewan pemangsa dan hewan pemakan bangkai, memiliki gigi tajam dan rahang yang kuat untuk menyerang, menggigit, dan mencabik-cabik makanan. Ciri-ciri khas dari moyang serigala masih bertahan pada anjing, walaupun penangkaran secara selektif telah berhasil mengubah bentuk fisik berbagai jenis anjing ras."
    };
    private static int [] dataFoto = {
            R.drawable.gajah,
            R.drawable.jerapah,
            R.drawable.kijang,
            R.drawable.rusa,
            R.drawable.sapi,
            R.drawable.burung,
            R.drawable.singa,
            R.drawable.macantutul,
            R.drawable.kucing,
            R.drawable.anjing
    };

    static ArrayList<hewan> getlistData(){
        ArrayList<hewan> list = new ArrayList<>();
        for (int position = 0; position <namaHewan.length; position++) {
            hewan hewan = new hewan();
            hewan.setNama(namaHewan[position]);
            hewan.setDetail(detailHewan[position]);
            hewan.setFoto(dataFoto[position]);
            list.add(hewan);
        }
        return list;
    }
}
