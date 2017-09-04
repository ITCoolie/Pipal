<?php
  $HTTP_HOST = $_SERVER['HTTP_HOST'];
  if ($HTTP_HOST == "www.customservice.studio" || $HTTP_HOST == "customservice.studio")
  {
    require "pipal.php";
  }
  elseif ($HTTP_HOST == "api.customservice.studio")
  {
    require "api.php";
  }
  elseif ($HTTP_HOST == "fs.customservice.studio")
  {
    require "fs.php";
  }
  elseif ($HTTP_HOST == "fe.customservice.studio")
  {
    require "fe/index.php";
  }
  else
  {
    require "wordpress/index.php";
  }
  
?>
