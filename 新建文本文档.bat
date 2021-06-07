    files=`find . -name '*.java' | xargs enca -L zh | grep GB2312 | cut -d: -f1`
    for f in $files; do
        iconv -f GBK -t UTF-8 $f > $f.utf && mv -f $f.utf $f && echo "$f done"
    done