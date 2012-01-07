import java.io.IOException;

final class at {

   static int b;
   static String[] a = new String[5];
   static Object[] c = je.a(1, new Object[1], 5, (byte)-115);


   static final int readBytesFromInputStreamWorker(Object[] wrapper, byte[] dest, int off, int len) throws IOException {
      ++b;
      if(null == wrapper) {
         throw new IllegalStateException();
      } else {
         Object[] var8 = (Object[])((Object[])wrapper[2]);
         int read = len;
         if(0 <= len && off >= 0 && ~(off + len) >= ~dest.length) {
            int var7;
            synchronized(var8 != null? var8[2] : null) {
               int var12;
               if(((int[])((int[])var8[1]))[2] < ((int[])((int[])var8[1]))[1]) {
                  var12 = ((int[])((int[])var8[1]))[2] + ((int[])((int[])var8[1]))[0] - ((int[])((int[])var8[1]))[1];
               } else {
                  var12 =  ((int[])((int[])var8[1]))[2] -((int[])((int[])var8[1]))[1];
               }

               if(read > var12) {
                  read = var12;
               }

               if(read == 0 && var8[3] != null) {
                  throw new IOException(((Throwable)var8[3]).toString());
               }

               if(~(((int[])((int[])var8[1]))[1] + read) >= ~((int[])((int[])var8[1]))[0]) {
                  System.arraycopy(var8[5], ((int[])((int[])var8[1]))[1], dest, off, read);
               } else {
                  int var13 = ((int[])((int[])var8[1]))[0] + -((int[])((int[])var8[1]))[1];
                  System.arraycopy(var8[5], ((int[])((int[])var8[1]))[1], dest, off, var13);
                  System.arraycopy(var8[5], 0, dest, off + var13, read + -var13);
               }

               ((int[])((int[])var8[1]))[1] = (((int[])((int[])var8[1]))[1] + read) % ((int[])((int[])var8[1]))[0];
               var8[2].notifyAll();
               var7 = read;
            }

            return var7;
         } else {
            throw new IOException();
         }
      }
   }

}
