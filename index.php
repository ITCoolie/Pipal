<?php
  $HTTP_HOST = $_SERVER['HTTP_HOST'];
  if ($HTTP_HOST == "www.customservice.studio")
  {
    require "wordpress/index.php";
  }
  elseif ($HTTP_HOST == "api.customservice.studio")
  {
    require "api.php";
  }
  elseif ($HTTP_HOST == "fs.customservice.studio")
  {
    require "fs.php";
  }
  else
  {
    require "www.php";
  }
  
?>
