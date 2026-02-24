(ns io.spiritt.lib-c.core
  (:require [io.spiritt.lib-b.core :as lib-b]))

(defn calculate [x]
  (lib-b/multiply x 10))

(comment
  (calculate 5)
  ;
  )