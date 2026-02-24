(ns io.spiritt.lib-b.core
  (:require [io.spiritt.lib-a.core :as lib-a]))

(defn multiply [a b]
  (* (lib-a/add a 0) b))

(comment
  (multiply 3 4)
  ;
  )