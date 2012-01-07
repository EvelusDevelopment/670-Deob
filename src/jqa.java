
class jqa implements Runnable {

   static int f;
   static int c;
   private Object[] g;
   static int a;
   static Object[] b = ed.a(2, new Object[1], (byte)-99, 73);
   static Object[] e = ed.a(12, new Object[1], (byte)-126, 35);
   static long d;


   jqa(Object[] var1) {
      this.g = var1;
   }

   public final void run() {
      ++a;
      Object[] var1 = this.g;
      if(null == var1) {
         throw new IllegalStateException();
      } else {
         ((boolean[])((boolean[])var1[2]))[1] = true;

         try {
            try {
               if(var1 != null && (-2 == ~var1.length || -9 == ~var1.length || 17 == var1.length && var1[6].equals(Integer.valueOf(1)))) {
                  ((long[])((long[])this.g[2]))[14] = -50L;
               }

               while(!((boolean[])((boolean[])var1[2]))[0]) {
                  for(int var2 = 0; 2 > var2; ++var2) {
                     Object[] var3 = ((Object[][])((Object[][])var1[1]))[var2];
                     if(null != var3) {
                        fr.a(var3, -116);
                     }
                  }

                  qs.a(10L, 76);
                  if(null != var1 && var1.length == 13) {
                     ((boolean[])((boolean[])var1[2]))[1] = false;
                     return;
                  }

                  lt.a((int)1392, (Object)null);
               }
            } catch (Exception var8) {
               taa.a(var8, 32, (String)null);
               ((boolean[])((boolean[])var1[2]))[1] = false;
               return;
            }

            ((boolean[])((boolean[])var1[2]))[1] = false;
         } finally {
            ((boolean[])((boolean[])var1[2]))[1] = false;
         }
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++f;
      ((tha)var1[1]).m |= Long.MIN_VALUE;
      if(var0 < 53) {
         a(((byte[])((byte[])((Object[])((Object[])e[0]))[0]))[0], (Object[])null);
      }

      if(0L == hfa.a(var1, 1)) {
         ama.a((tha)(var1 == null?null:var1[1]), (byte)-102, tia.f_l);
      }

   }

   static final void a(int var0, Object[] var1) {
      ((boolean[])((boolean[])var1[8]))[7] = false;
      ++c;
      if(var0 != -65537) {
         a((byte)63, (Object[])null);
      }

      if(null != var1[18]) {
         ((ka)var1[18]).G(((ka)var1[18]).va() & -65537);
      }

   }

}
