# Disini kita menggunakan metode:

### Jaccard Similarity
Untuk mencocokan dengan similarity kita

### Collaborative Filtering
Untuk mencocokan dengan rekomendasi berdasarkan hasil rating orang lain

### Clustering
Mengkategorisasi untuk masuk ke group yang berbeda

# Cara menjalankan

  1. pake requirement.txt
  ```
  pip install -r requirements.txt
  ```

  2. jalanin model
  ```
  python src/spark_model.py
  ```

  3. save model
  ```
  python src/pickle_model.py
  ```
  4. run website
  ```
  python webapp/server.py
  ```

  5. copy dan paste link local website ke browser anda