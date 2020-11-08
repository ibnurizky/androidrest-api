<?php
  require_once('koneksi.php');

  $id 	= $_POST['id'];
  $nama = $_POST['nama'];
  $posisi = $_POST['posisi'];
  $gajih = $_POST['gajih'];
	
	class emp{}
	
	if (empty($id) || empty($nama) || empty($posisi) || empty($gajih)) { 
		$response = new emp();
		$response->success = 0;
		$response->message = "Kolom isian tidak boleh kosong"; 
		die(json_encode($response));
	} else {
		$query = mysqli_query($koneksi, "update penggajihan set nama = '$nama', posisi = '$posisi', gajih = '$gajih' where id = '$id'");
		
		if ($query) {
			$response = new emp();
			$response->success = 1;
			$response->message = "Data berhasil di update";
			die(json_encode($response));
		} else{ 
			$response = new emp();
			$response->success = 0;
			$response->message = "Error update Data";
			die(json_encode($response)); 
		}	
	}
?>