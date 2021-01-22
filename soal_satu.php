<?php 
function getMaxLength($arr, $n) 
{ 
    // count 
    $count = 0;  
      
    // max 
    $result = 0;  
  
    for ($i = 0; $i < $n; $i++) 
    { 
        // Reset count saat 0 ditemukan 
        if ($arr[$i] == 0) 
            $count = 0;

		// jika 1 ditemukan maka increment hitung dan perbaharui
        else
        { 
            $count++; 
            $result = max($result, $count); 
        } 
    } 
  
    return $result; 
} 

$arr = array(1,1,0,1,1,1); 
$arr = array(1,0,0,1,0,1,1); 
$n = sizeof($arr) / sizeof($arr[0]); 
echo getMaxLength($arr, $n) ; 
 
?> 