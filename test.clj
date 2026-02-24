(ns test
  (:require
   [k16.kmono.workspace :as kmono.workspace]))

(defn print-packages [& [_opts]]
  (let [{:keys [packages]} (kmono.workspace/resolve-workspace-context!)]
    (println "Packages:")
    (doseq [[fqn _] packages]
      (println "  -" fqn))))

(comment
  (print-packages)
  ;
  )
