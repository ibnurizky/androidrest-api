<?php
   require_once('koneksi.php');

   $nama = $_POST['nama'];
   $posisi = $_POST['posisi'];
   $gajih = $_POST['gajih'];

   class emp{}

   if (empty($nama) || empty($posisi) || empty($posisi)) {
       $response = new emp();
       $response->success = 0;
	   $response->message = "Kolom isian tidak boleh kosong"; 
		die(json_encode($response));
	} else {
		$query = mysqli_query($koneksi, "insert into penggajihan values('','$nama','$posisi','$gajih')");
		
		if ($query) {
			$response = new emp();
			$response->success = 1;
			$response->message = "Data berhasil di simpan";
			die(json_encode($response));
		} else{ 
			$response = new emp();
			$response->success = 0;
			$response->message = "Error simpan Data";
			die(json_encode($response)); 
		}	
	}

?>