(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-1472.core
   :output-to "out/cljs_1472.js"
   :output-dir "out"})
