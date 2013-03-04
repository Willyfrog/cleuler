(ns cleuler.problem002)

(defn next-fib [x] (+ (last x) (last (butlast x))))

(defn cons-fib [x] (conj x (next-fib x)))

(defn fib-until [x y] (let [z (next-fib x)]
                        (if (< z y)
                          (fib-until (conj x z) y)
                          x)))
(defn solution [] (reduce (fn [x y] (+ x y)) 
        (filter even?
                (fib-until [1 2] 4000000))))
