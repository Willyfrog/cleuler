(ns problem001)

(defn is-mult [x y] (= (rem y x) 0))

(defn is-3-mult [x] (is-mult 3 x))

(defn is-5-mult [x] (is-mult 5 x))

(defn is-3-or-5-mult [x] (or (is-3-mult x) (is-5-mult x)))

(defn sum-3-or-5-mult [x] (reduce + (filter is-3-or-5-mult (range 1 x))))
