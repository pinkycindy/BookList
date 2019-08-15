package com.example.booklist;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    String[] judul= {"Rindu", "Hujan", "Konspirasi Alam Semesta", "Bumi", "Bulan", "Rentang Kisah", "Bumi Manusia", "Perahu Kertas", "Aroma Karsa", "Filosofi Kopi"};
    Integer[] menuImage = {
            R.drawable.book1,
            R.drawable.book2,
            R.drawable.book3,
            R.drawable.book4,
            R.drawable.book5,
            R.drawable.book6,
            R.drawable.book7,
            R.drawable.book8,
            R.drawable.book9,
            R.drawable.book10};
    String[] penulis = {"Tere Liye", "Tere Liye", "Firsa Besari", "Tere Liye", "Tere Liye", "Gita Savitri", "Pramoedya Ananta Toer", "Dee Lestari",
            "Dee Lestasi", "Dee Lestari"};
    String[] sinopsis={
            "\"Apalah arti memiliki, ketika diri kami sendiri bukanlah milik kami?\n" +
                    "\n" +
                    "Apalah arti kehilangan, ketika kami sebenarnya menemukan banyak saat kehilangan, dan sebaliknya, kehilangan banyak pula saat menemukan?\n" +
                    "\n" +
                    "Apalah arti cinta, ketika menangis terluka atas perasaan yg seharusnya indah? Bagaimana mungkin, kami terduduk patah hati atas sesuatu yg seharusnya suci dan tidak menuntut apa pun?\n" +
                    "\n" +
                    "Wahai, bukankah banyak kerinduan saat kami hendak melupakan? Dan tidak terbilang keinginan melupakan saat kami dalam rindu? Hingga rindu dan melupakan jaraknya setipis benang saja”",
            "Tentang persahabatan\n" +
                    "Tentang cinta\n" +
                    "Tentang perpisahan\n" +
                    "Tentang melupakan\n" +
                    "Tentang hujan",
            "Seperti apakah warna cinta? Apakah merah muda mewakili rekahannya, ataukah kelabu mewakili pecahannya?",
            "Namaku Raib, usiaku 15 tahun, kelas sepuluh. Aku anak perempuan seperti kalian, adik-adik kalian, tetangga kalian. Aku punya dua kucing, namanya si Putih dan si Hitam. Mama dan papaku menyenangkan. Guru-guru di sekolahku seru. Teman-temanku baik dan kompak.\n" +
                    "\n" +
                    "Aku sama seperti remaja kebanyakan, kecuali satu hal. Sesuatu yang kusimpan sendiri sejak kecil. Sesuatu yang menakjubkan.\n" +
                    "\n" +
                    "Namaku, Raib. Dan aku bisa menghilang.",
            "Namanya Seli, usianya 15 tahun, kelas sepuluh. Dia sama seperti remaja yang lain. Menyukai hal yang sama, mendengarkan lagu-lagu yang sama, pergi ke gerai fast food, menonton serial drama, film, dan hal-hal yang disukai remaja.\n" +
                    "\n" +
                    "Tetapi ada sebuah rahasia kecil Seli yang tidak pernah diketahui siapa pun. Sesuatu yang dia simpan sendiri sejak kecil. Sesuatu yang menakjubkan dengan tangannya.\n" +
                    "\n" +
                    "Namanya Seli. Dan tangannya bisa mengeluarkan petir.",
            "Apa tujuan hidupmu?\n" +
                    "Kalau itu ditanyakan kepadaku saat remaja, aku pasti nggak bisa\n" +
                    "menjawabnya. Jangankan tujuan hidup, cara belajar yang benar saja aku nggak tahu. Setiap hari aku ke sekolah lebih suka bertemu teman-teman dan bermain kartu. Aku nggak tahu apa yang menjadi passion-ku. Aku sekadar menjalani apa yang ibu pilihkan untukku—termasuk melanjutkan kuliah di Jerman.\n" +
                    "\n" +
                    "Tentu bukan keputusan mudah untuk hidup mandiri di negara baru. Selama 7 tahun tinggal di Jerman, banyak kendala aku alami; bahasa Jerman yang belum fasih membuat proses perkuliahan menjadi berat, hingga uang yang pas-pasan membuatku harus mengatur waktu antara kuliah dan kerja sambilan.\n" +
                    "\n" +
                    "Semua proses yang sulit itu telah mengubahku; jadi mengenal diri sendiri, mengenal agamaku, dan memahami untuk apa aku ada di dunia. Buatku, kini hidup tak lagi sama, bukan hanya tentang aku, aku, dan aku. Tapi juga, tentang orangtua, orang lain, dan yang paling penting mensyukuri semua hal yang sudah Tuhan berikan.\n" +
                    "\n" +
                    "The purpose to live a happy life is to always be grateful and don’t forget the magic word: ikhlas, ikhlas, ikhlas. ",
            "Roman Tetralogi Buru mengambil latar belakang dan cikal bakal nation Indonesia di awal abad ke-20. Dengan membacanya waktu kita dibalikkan sedemikian rupa dan hidup di era membibitnya pergerakan nasional mula-mula, juga pertautan rasa, kegamangan jiwa, percintaan, dan pertarungan kekuatan anonim para srikandi yang mengawal penyemaian bangunan nasional yang kemudian kelak melahirkan Indonesia modern.\n" +
                    "\n" +
                    "Roman bagian pertama; Bumi Manusia, sebagai periode penyemaian dan kegelisahan dimana Minke sebagai aktor sekaligus kreator adalah manusia berdarah priyayi yang semampu mungkin keluar dari kepompong kejawaannya menuju manusia yang bebas dan merdeka, di sudut lain membelah jiwa ke-Eropa-an yang menjadi simbol dan kiblat dari ketinggian pengetahuan dan peradaban.\n" +
                    "\n" +
                    "Pram menggambarkan sebuah adegan antara Minke dengan ayahnya yang sangat sentimentil: Aku mengangkat sembah sebagaimana biasa aku lihat dilakukan punggawa terhadap kakekku dan nenekku dan orangtuaku, waktu lebaran. Dan yang sekarang tak juga kuturunkan sebelum Bupati itu duduk enak di tempatnya. Dalam mengangkat sembah serasa hilang seluruh ilmu dan pengetahuan yang kupelajari tahun demi tahun belakangan ini. Hilang indahnya dunia sebagaimana dijanjikan oleh kemajuan ilmu .... Sembah pengagungan pada leluhur dan pembesar melalui perendahan dan penghinaan diri! Sampai sedatar tanah kalau mungkin! Uh, anak-cucuku tak kurelakan menjalani kehinaan ini.\n" +
                    "\n" +
                    "\"Kita kalah, Ma,\" bisikku.\n" +
                    "\n" +
                    "\"Kita telah melawan, Nak, Nyo, sebaik-baiknya, sehormat-hormatnya.\"",
            "Namanya Kugy. Mungil, pengkhayal, dan berantakan. Dari benaknya, mengalir untaian dongeng indah. Keenan belum pernah bertemu manusia seaneh itu.\n" +
                    "\n" +
                    "...\n" +
                    "\n" +
                    "Namanya Keenan. Cerdas, artistik, dan penuh kejutan. Dari tangannya, mewujud lukisan-lukisan magis. Kugy belum pernah bertemu manusia seajaib itu.",
            "Dari sebuah lontar kuno, Raras Prayagung mengetahui bahwa Puspa Karsa yang dikenalnya sebagai dongeng, ternyata tanaman sungguhan yang tersembunyi di tempat rahasia.\n" +
                    "\n" +
                    "Obsesi Raras memburu Puspa Karsa, bunga sakti yang konon mampu mengendalikan kehendak dan cuma bisa diidentifikasi melalui aroma, mempertemukannya dengan Jati Wesi.\n" +
                    "\n" +
                    "Jati memiliki penciuman luar biasa. Di TPA Bantar Gebang, tempatnya tumbuh besar, ia dijuluki si Hidung Tikus. Dari berbagai pekerjaan yang dilakoninya untuk bertahan hidup, satu yang paling Jati banggakan, yakni meracik parfum.\n" +
                    "\n" +
                    "Kemampuan Jati memikat Raras. Bukan hanya mempekerjakan Jati di perusahaannya, Raras ikut mengundang Jati masuk ke dalam kehidupan pribadinya. Bertemulah Jati dengan Tanaya Suma, anak tunggal Raras, yang memiliki kemampuan serupa dengannya.\n" +
                    "\n" +
                    "Semakin jauh Jati terlibat dengan keluarga Prayagung dan Puspa Karsa, semakin banyak misteri yang ia temukan, tentang dirinya dan masa lalu yang tak pernah ia tahu",
            "emaknaan kembali kembali kopi, Buddha, Herman, surat tak tarkirimkan, cinta sejenis yang manis atau apa pun, membuktikan Dee tetap memesona. Kalau kemarin panitia Nobel sastra masih maju mundur dengan nama Pramoedya, sekarang bisa memaknai kembali, melalui karya-karya ini.\n" +
                    "\n" +
                    "Ruang cerpen yang sempit dijadikannya wahana yang intens namun tidak sesak untuk mengungkapkan apa yang tak selalu mampu dikatakan. Lewat refleksi dan monolog interior yang digarap dengan cakap dan jernih. pembaca diajaknya menjelajahi halaman-halaman kecil dalam cerpen yang kini dijadikannya semesta kehidupan."
    };


    Integer id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent mIntent = getIntent();
        id = mIntent.getIntExtra("id", 0);
        ImageView ivBack = findViewById(R.id.iv_back);
        ImageView ivBook = findViewById(R.id.iv_book);
        TextView tvJudul = findViewById(R.id.tv_judul);
        TextView tvPenulis = findViewById(R.id.tv_penulis);
        TextView tvSinopsis = findViewById(R.id.tv_sinopsis);

        ivBook.setImageResource(menuImage[id]);
        tvJudul.setText(judul[id]);
        tvPenulis.setText(penulis[id]);
        tvSinopsis.setText(sinopsis[id]);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });


    }

}
