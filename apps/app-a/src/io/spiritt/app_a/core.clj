(ns io.spiritt.app-a.core
  (:require
   [io.spiritt.lib-c.core :as lib-c]))

(defn run [n]
  (lib-c/calculate n))

(comment
  (run 7)
  ;
  )