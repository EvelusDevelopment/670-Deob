import jaclib.memory.Buffer;

final class bua extends rqa {

   static int j;
   static String[] d;
   static int g;
   static int f_i;
   static int e;
   static int f;
   static Object[] k = st.a(new Object[1], 7, 40, 9);
   static Object[] c = sd.a(new Object[1], 112, (byte)126);
   static Object[] h = im.a(new Object[2], (int)-16365);


   static final int[] a(Object[] var0, int var1) {
      if(var1 != 9) {
         h = (Object[])null;
      }

      ++j;
      int[] var2 = null;
      if(!qe.a(((int[])((int[])var0[1]))[1], var1 ^ 1)) {
         if(0 == ~((int[])((int[])var0[1]))[4]) {
            if(Class_m.a(((int[])((int[])var0[1]))[1], var1 - 122)) {
               hna var3 = (hna)pm.a((long)((int)((long[])((long[])var0[2]))[1]), hf.g, false);
               if(null != var3) {
                  Object[] var4 = var3.k;
                  Object[] var5 = (Object[])((Object[])var4[42]);
                  if(var5[11] != null) {
                     var5 = ria.a(eo.g, var5, -63);
                  }

                  if(null != var5) {
                     var2 = (int[])((int[])var5[7]);
                  }
               }
            } else if(mka.a(88, ((int[])((int[])var0[1]))[1])) {
               Object[] var6 = mca.a(true, (int)(2147483647L & ((long[])((long[])var0[2]))[1] >>> 32), lja.d);
               if(null != var6[11]) {
                  var6 = vs.a(eo.g, var6, (byte)-101);
               }

               if(null != var6) {
                  var2 = (int[])((int[])var6[6]);
               }
            }
         } else {
            var2 = (int[])((int[])us.a(((int[])((int[])var0[1]))[4], (byte)22, cqa.a)[11]);
         }
      } else {
         var2 = (int[])((int[])us.a((int)((long[])((long[])var0[2]))[1], (byte)89, cqa.a)[11]);
      }

      return var2;
   }

   static final void a(Object[] var0, boolean var1, Object[] var2) {
      ++f_i;
      if(!var1) {
         if(null != var2) {
            ((lm)(var2 != null?var2[0]:null)).a((byte)65);
            ((tha)(var2 == null?null:var2[0])).a(8192);
            ((int[])((int[])var0[1]))[0] += ((int[])((int[])var2[1]))[0];
         }

      }
   }

   static final void a(Object[] var0, int var1, int var2) {
      if(var1 != 40) {
         d = (String[])null;
      }

      ++g;
   }

   static final void a(Object[] var0, byte var1) {
      if(null == var0[8]) {
         var0[8] = new boolean[1];
      }

      if(var0[1] == null) {
         var0[1] = new int[3];
      }

      if(var1 != -23) {
         a(-77, (Object[])null, (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])k[18]))[1]))[8]));
      }

      ++e;
   }

   bua(Object[] var1, Object[] var2, byte[] var3, int var4) {
      super(var2, var3, var4);
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      ++f;
      if(-1 != ((int[])((int[])var2[var0]))[39]) {
         return cfa.a(((int[])((int[])var2[1]))[39], var0 + 8, var1);
      } else {
         if(!((boolean[])((boolean[])var1[0]))[0]) {
            int var7 = ((int[])((int[])var2[1]))[3] >>> 16;
            Object[] var8 = InputStreamWorker.a(new Object[3], (byte)-128, lfa.c);
            if(var8 != null && var8.length == 13 && var8[4].equals(Boolean.valueOf(false))) {
               eoa.a(-95);
            }

            oh var3;
            oh var4;
            for(Object[] var6 = (var3 = (oh)wla.a((byte)90, var8)) == null?null:var3.p; null != var6; var6 = (var4 = (oh)em.a(var0 ^ 1, var8)) != null?var4.p:null) {
               if(((int[])((int[])var6[1]))[1] == var7) {
                  return hg.a((int)((lm)(null == var6?null:var6[0])).e, (byte)-101);
               }
            }
         }

         return null;
      }
   }

   bua(Object[] var1, Object[] var2, Buffer var3) {
      super(var2, var3);
   }

}
