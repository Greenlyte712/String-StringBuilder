console output:

before change:

I am a String and so I am immutable
100
I am  a StringBuilder so I am mutable
{"name":"sam","age":30}

after change() is called:
 -----------------------
| inside method:        |
|                       |
| String changed        |
| StringBuilder changed |
|                       |
 -----------------------
I am a String and so I am immutable <------- No
100 <------- No
StringBuilder changed <------- Yes
{"name":"sam","age":30} <------- Yes
