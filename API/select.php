<?php
require_once('koneksi.php');
$query = mysqli_query($koneksi, "select * from penggajihan");
$json = array();
while ($row = mysqli_fetch_assoc($query)) {
    $json[] = $row;
}
echo json_encode($json);
mysqli_close($koneksi);
?>