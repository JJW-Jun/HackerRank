### 한글 폰트 설치 ###
import matplotlib as mpl
import matplotlib.pyplot as plt
import matplotlib.font_manager as fm
from matplotlib import font_manager




fontpath = 'C:/Windows/Fonts/malgun.ttf'
font = fm.FontProperties(fname=fontpath, size=9)
plt.rc('font', family='malgun')
mpl.font_manager._rebuild()



### Data load ###
import pandas as pd
db = pd.read_csv('exchange_rate.csv', encoding='UTF-16')
print(db)



### Data 정제 ###
import re
db = db['제목']
db = db.apply(lambda x:re.sub('[^가-힣\s]', '', x))
print(db)



from soynlp.word import WordExtractor
word_extractor = WordExtractor(min_frequency=100,
    min_cohesion_forward=0.05,
    min_right_branching_entropy=0.0
)
word_extractor.train(db) # list of str or like
words = word_extractor.extract()


# LTo
from soynlp.tokenizer import LTokenizer
from soynlp.word import WordExtractor
from soynlp.utils import DoublespaceLineCorpus

cohesion_score = {word:score.cohesion_forward for word, score in words.items()}
tokenizer = LTokenizer(scores=cohesion_score)




db = db.apply(lambda x:tokenizer.tokenize(x, remove_r=True))
print(db)


# 빈도수 구하기
words = []
for i in db.values :
    for k in i :
        words.append(k)

print(words)



from collections import Counter
count = Counter(words)
word_dict = dict(count)
print(word_dict, sep= 'word.csv')

# db.to_csv('많이 사용 된 어휘 추출.csv', encoding='CP949')





import wordcloud
from wordcloud import WordCloud
# from wordcloud.wordcloud import WordClou
# import stopword


word = WordCloud(font_path=fontpath, background_color='white', width=600, height=600).generate_from_frequencies(word_dict)
plt.figure(figsize=(10,10))
plt.imshow(word)
plt.axis('off')
plt.show()
